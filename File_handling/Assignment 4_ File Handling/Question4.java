import java.io.*;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Question4 filename");
            System.exit(1);
        }

        File inputFile = new File(args[0]);            // File to read integers
        File errorFile = new File("error_log.txt");    // File to log errors

        int sum = 0;        // Sum of valid integers
        int lineNumber = 0; // Keep track of line numbers

        try {
            Scanner input = new Scanner(inputFile);
            PrintWriter errorLog = new PrintWriter(new FileOutputStream(errorFile, true)); // append mode

            while (input.hasNextLine()) {
                lineNumber++;
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);

                while (lineScanner.hasNext()) {
                    String token = lineScanner.next();
                    try {
                        int number = Integer.parseInt(token); // try to convert to integer
                        sum += number;
                    } catch (NumberFormatException ex) {
                        // Log invalid token with line number
                        errorLog.println("Line " + lineNumber + ": Invalid integer -> " + token);
                    }
                }
                lineScanner.close();
            }

            input.close();
            errorLog.close();

            System.out.println("Total sum of valid integers: " + sum);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + args[0]);
        }
    }
}

