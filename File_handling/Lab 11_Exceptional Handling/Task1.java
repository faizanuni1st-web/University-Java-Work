import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean valid = false;

        while (!valid) { 
            try {
                System.out.print("Enter first integer: ");
                num1 = Integer.parseInt(input.nextLine()); // read as string and convert to integer

                System.out.print("Enter second integer: ");
                num2 = Integer.parseInt(input.nextLine());

                valid = true; // If conversion succeeds, input is valid

            } catch (NumberFormatException ex) {
                System.out.println("You have entered an invalid input, type integers only.");
            }
        }

        System.out.println("Sum of the two integers: " + (num1 + num2));
        input.close();
    }
}
