import java.util.Scanner;

public class Assignment2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        
       if (decimal == 0) {
            System.out.println("Binary value: 0");
            return;
        }

        String binary = ""; // to store binary digits in reverse order

        while (decimal > 0) {
            int remainder = decimal % 2;    
            binary = remainder + binary;              
      decimal = decimal / 2;         
     }

        System.out.println("Binary value: " + binary);

        input.close();
    }
}
