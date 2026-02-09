import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        int[] numbers = new int[10]; // we know there are 10 integers
        int count = 0;

        try {
            Scanner input = new Scanner(file);

            // Read integers from file
            while (input.hasNextLine() && count < 10) {
                String line = input.nextLine();
                numbers[count] = Integer.parseInt(line.trim());
                count++;
            }
            input.close();

            // Sort array in ascending order
            Arrays.sort(numbers);

            // Display sorted numbers
            System.out.println("Numbers in ascending order:");
            for (int num : numbers) {
                System.out.println(num);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + file.getName());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number in the file.");
        }
    }
}

