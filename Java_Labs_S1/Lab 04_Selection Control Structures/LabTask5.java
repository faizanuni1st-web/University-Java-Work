import java.util.Scanner;

public class LabTask5 {

            public static void main(String[] args) {

int num1;
int num2;
int num3;
int a = 2;
int b = 3;
int c = 0;

 Scanner sc = new Scanner(System.in);
  
 System.out.print(" Enter first number  :  ");
        num1 = sc.nextInt();
 
 System.out.print(" Enter second number :  ");
       num2 = sc.nextInt();

 System.out.print(" Enter third number  :  ");
       num3 = sc.nextInt();


 if( num1 == num2 && num1 == num3) {
 System.out.println(" equals numbers are :  " + b);}

else if (num1 == num2 && num1 != num3 ) {
 System.out.println(" Equal numbers are :  " + a);}

else if (num1 == num3 && num1 != num2 ) {
 System.out.println(" Equal numbers are :  " + a);}

else if (num2 == num3 && num2 != num1 ) {
 System.out.println(" Equal numbers are :  " + a);}


else {
System.out.println(" Equal numbers are :  " + c);}

} 
 }
  



  
