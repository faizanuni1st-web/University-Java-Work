import java.util.Scanner;

public class IncomeTask6 {
    
       public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);

     
System.out.print(" Enter the pay rate for an hour: $");
 
      double Payrate= input.nextDouble();
         System.out.println();

System.out.print(" Enter the number of hours you worked each week: ");

       double Hours= input.nextDouble();
       System.out.println();

double income = 5 * ( Payrate * Hours);
double income2 = income - ( income * 0.14 );

double clothes = income2 * 0.10;
 double supplies = income2 * 0.01;

double savingbonds = ( income2 - clothes - supplies ) * 0.25;

double parentsbonds = savingbonds * 0.50;


System.out.println(" Your income before taxes from your summer job is  $" + income );

System.out.println(" Your income after taxes from your summer job is   $" + income2 );


System.out.println(" The money you spend on clothes and accessories is $" + clothes );
System.out.println("    The money you spend on school supplies is      $" + supplies );

System.out.println("  The money you spend on buying saving bonds is    $" + savingbonds );


System.out.println(" The money your parents spend on buying saving bonds for you is $" + parentsbonds );

   input.close();
}
 }
























