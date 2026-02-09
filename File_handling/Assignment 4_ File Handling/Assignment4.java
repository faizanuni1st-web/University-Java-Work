import java.io.*;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== File Handling Assignment Menu ===");
            System.out.println("1. Question 1: Write 100 random integers to Text_IO.txt");
            System.out.println("2. Question 2: Count characters, words, and lines in a file");
            System.out.println("3. Question 3: Baby name ranking search");
            System.out.println("4. Question 4: Sum integers from file and log errors");
            System.out.println("5. Question 5: Search a word in a file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 


            switch (choice) {
                case 1:
                    question1();
                    break;
                case 2:
                    System.out.print("Enter the filename: ");
                    String fileName2 = input.nextLine();
                    question2(fileName2);
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    System.out.print("Enter the filename: ");
                    String fileName4 = input.nextLine();
                    question4(fileName4);
                    break;
                case 5:
                    System.out.print("Enter the filename: ");
                    String fileName5 = input.nextLine();
                    System.out.print("Enter the word to search: ");
                    String word = input.nextLine();
                    question5(fileName5, word);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        input.close();
    }

    // Question 1
    public static void question1() {
        File file = new File("Text_IO.txt");

        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
            for (int i = 0; i < 100; i++) {
                int num = (int)(Math.random() * 1000);
                output.print(num + " ");
            }
            output.close();
            System.out.println("100 random integers written to Text_IO.txt");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // Question 2
    public static void question2(String fileName) {
        File file = new File(fileName);
        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                if (!line.trim().isEmpty()) wordCount += words.length;
            }
            input.close();

            System.out.println("File: " + fileName);
            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }
    }

    // Question 3
    public static void question3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter the gender (M/F): ");
        String gender = input.nextLine().toUpperCase();
        System.out.print("Enter the name: ");
        String name = input.nextLine();

        String fileName = "babynameranking" + year + ".txt";
        File file = new File(fileName);
        boolean found = false;

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split("\\s+");
                String rank = tokens[0];
                String boyName = tokens[1];
                String girlName = tokens[3];

                if (gender.equals("M") && boyName.equalsIgnoreCase(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    found = true;
                    break;
                } else if (gender.equals("F") && girlName.equalsIgnoreCase(name)) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    found = true;
                    break;
                }
            }
            fileScanner.close();

            if (!found) System.out.println(name + " is not ranked in year " + year);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
        }
    }

    // Question 4
    public static void question4(String fileName) {
        File inputFile = new File(fileName);
        File errorFile = new File("error_log.txt");
        int sum = 0, lineNumber = 0;

        try {
            Scanner input = new Scanner(inputFile);
            PrintWriter errorLog = new PrintWriter(new FileOutputStream(errorFile, true));
            while (input.hasNextLine()) {
                lineNumber++;
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()) {
                    String token = lineScanner.next();
                    try {
                        int number = Integer.parseInt(token);
                        sum += number;
                    } catch (NumberFormatException ex) {
                        errorLog.println("Line " + lineNumber + ": Invalid integer -> " + token);
                    }
                }
                lineScanner.close();
            }
            input.close();
            errorLog.close();

            System.out.println("Total sum of valid integers: " + sum);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
        }
    }

    // Question 5
    public static void question5(String fileName, String wordToSearch) {
        File file = new File(fileName);
        int lineNumber = 0;
        boolean found = false;

        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                lineNumber++;
                String line = input.nextLine();
                if (line.contains(wordToSearch)) {
                    System.out.println("Word found at line " + lineNumber);
                    found = true;
                }
            }
            input.close();

            if (!found) System.out.println("The word \"" + wordToSearch + "\" was not found in the file.");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
        }
    }
}
