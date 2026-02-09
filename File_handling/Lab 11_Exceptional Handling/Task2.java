import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;

       
        while (i < 10) {
            try {
                System.out.print("Enter integer " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(input.nextLine());
                i++;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, type integers only. Try again.");
            }
        }

        
        boolean validIndex = false;
        while (!validIndex) {
            try {
                System.out.print("Enter an index (0-9): ");
                int index = Integer.parseInt(input.nextLine());
                System.out.println("Value at index " + index + " is " + arr[index]);
                validIndex = true;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, type integers only. Try again.");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid index, must be between 0 and 9. Try again.");
            }
        }

        input.close();
    }
}
