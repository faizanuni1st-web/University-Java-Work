import java.util.Scanner;

public class LabTask9 {

            public static void main(String[] args) {

double a;
double b;
double c;
double d;

 Scanner sc = new Scanner(System.in);
  
 System.out.print("Enter the number of pennies   : ");
        a = sc.nextDouble();
 
 System.out.print(" Enter the number of nickels  : ");
       b = sc.nextDouble();

 System.out.print(" Enter the number of dimes    : ");
       c = sc.nextDouble();
 System.out.print(" Enter the number of quarters : ");
       d = sc.nextDouble();

     System.out.println();

 double P = a * 0.01;
 double N = b * 0.05;
 double D = c * 0.10;
 double Q = d * 0.25;

double sum = P + N + D + Q; 
 
 if( sum == 1 ) {
 System.out.println(" Congratulatins! you have win the game ");}

 else if( sum > 1 ) {
 System.out.println(" The amount entered is greater then dollar ");}
else {
System.out.println(" The amount entered is less then dollar ");}

 sc.close();

} 
 }
  



  
