import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        File file = new File("numbers.txt");
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from file
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                int num = Integer.parseInt(input.nextLine().trim());
                if (!isPrime(num)) { // only keep non-prime numbers
                    numbers.add(num);
                }
            }
            input.close();

            // Write remaining numbers back to the same file
            PrintWriter output = new PrintWriter(new FileOutputStream(file));
            for (int num : numbers) {
                output.println(num);
            }
            output.close();

            System.out.println("Prime numbers removed. Updated data saved in numbers.txt.");

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + file.getName());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number in the file.");
        }
    }
}

