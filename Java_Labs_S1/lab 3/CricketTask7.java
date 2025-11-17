import java.util.Scanner;

public class CricketTask7 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
    System.out.print("Enter number of Class A tickets sold: ");
        int a = console.nextInt();
        
    System.out.print("Enter number of Class B tickets sold: ");
        int b = console.nextInt();
       
    System.out.print("Enter number of Class C tickets sold: ");
        int c = console.nextInt();
       
     System.out.print("Enter number of Class D tickets sold: ");
         int d = console.nextInt();
        System.out.println();
       
        int incomeA = a * 20;
        int incomeB = b * 15;
        int incomeC = c * 10;
        int incomeD = d * 5;
        
    int totalIncome = incomeA + incomeB + incomeC + incomeD;
       
        System.out.println("Income from Class A: $" + incomeA);
        System.out.println("Income from Class B: $" + incomeB);
        System.out.println("Income from Class C: $" + incomeC);
        System.out.println("Income from Class D: $" + incomeD);
        System.out.println();

        System.out.println("  Total Income:      $" + totalIncome);
              console.close();
    }
}
