import java.io.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume newline

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
                String[] tokens = line.split("\\s+"); // Split line by whitespace

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

            if (!found) {
                System.out.println(name + " is not ranked in year " + year);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
        }

        input.close();
    }
}

