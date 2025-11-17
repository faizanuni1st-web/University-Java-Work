import java.util.Scanner;

 public class DollarsTask1{

           public static void main(String[] args){

       Scanner input = new Scanner(System.in);

System.out.print(" Enter a decimal number ");
     double decimal= input.nextDouble();
            System.out.println();


double cents     = decimal*100;
double dollars   = cents/100;
double reminder1 = cents%100;
double quarter   = reminder1/25;
double reminder2 = reminder1%25;
double dimes     = reminder2/10;
double reminder3 = reminder2%10;
double nickels   = reminder3/5;
double pennies   = reminder3%5;


System.out.println(" Cents equals to    " + cents ); 
System.out.println(" Dollars equals to  " + dollars ); 
System.out.println(" Quarter equals to  " + quarter ); 
System.out.println(" Dimes equals to    " + dimes ); 
System.out.println(" Nickels equals to  " + nickels ); 
System.out.println(" Pennies equals to  " + pennies );


            input.close(); 

} 
 }















 





