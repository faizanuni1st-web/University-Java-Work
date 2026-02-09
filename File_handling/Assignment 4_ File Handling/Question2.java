import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        // Check if a filename is provided
        if (args.length == 0) {
            System.out.println("Usage: java Question2 filename");
            System.exit(1);
        }

        File file = new File(args[0]);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineCount++;

                charCount += line.length();

                // Split by whitespace → counts words
                String[] words = line.split("\\s+");
                
                // If the line is not empty
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            input.close();

            System.out.println("File: " + args[0]);
            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }
    }
}

