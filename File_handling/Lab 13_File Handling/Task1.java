import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 integers from the user
        for (int i = 0; i < 10; ) {
            try {
                System.out.print("Enter integer " + (i + 1) + ": ");
                numbers[i] = Integer.parseInt(input.nextLine());
                i++; // move to next only if input is valid
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, type integers only. Try again.");
            }
        }

        // Save numbers to a file
        File file = new File("numbers.txt");
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(file));
            for (int num : numbers) {
                output.println(num);
            }
            output.close();
            System.out.println("10 integers saved to numbers.txt successfully.");
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }

        input.close();
    }
}

