import java.io.*;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Check command-line arguments
        if (args.length < 2) {
            System.out.println("Usage: java Question5 filename wordToSearch");
            System.exit(1);
        }

        File file = new File(args[0]);
        String wordToSearch = args[1];

        int lineNumber = 0;
        boolean found = false;

        try {
            Scanner input = new Scanner(file);

            // Read file line by line
            while (input.hasNextLine()) {
                lineNumber++;
                String line = input.nextLine();

                if (line.contains(wordToSearch)) {
                    System.out.println("Word found at line " + lineNumber);
                    found = true;
                }
            }

            input.close();

            if (!found) {
                System.out.println("The word \"" + wordToSearch + "\" was not found in the file.");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + args[0]);
        }
    }
}

