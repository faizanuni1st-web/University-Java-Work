//Importing Scanner class from java.util
 import java.util.Scanner; 
public class LabTask3{ 
public static void main(String [] arg){ 
// Reading data using Scanner class 
Scanner console = new Scanner(System.in); 
//Declaring and initializing variables 
int SECRET= 11; 
double RATE= 12.50; 
// Declaring variables 
int num1; 
int num2;  
int newNum; 
//Declaring variables 
String name; 
double hoursWorked; 
double wages; 
//Taking input from user
 System.out.print(" Enter first integer:  "); 
num1 = console.nextInt(); 
//Read first integer
 System.out.println(); 
//Taking input from user 
System.out.print(" Enter second integer:  "); 
num2 = console.nextInt(); 
//Read second integer
 System.out.println(); 
//Printing num1 and num2 
System.out.println(" The value of num1 = " + num1); 
System.out.println(" The value of num2 = " + num2); 
// Initializing and printing newNum 
newNum = num1 * 2 + num2; 
System.out.println(" The value of new num = " + 
newNum); 
// Updating and then printing newNum 
newNum = SECRET + newNum; 
System.out.println(" updated value of newNum = " + 
newNum); 
// Taking data from user 
System.out.print(" Your Last name: "); 
name = console.next (); // Reading last name 
 
//Taking data from user 
System.out.println(" Enter a decimal number between 0 
and 70 : "); 
hoursWorked = console.nextDouble(); //Reading data 
 
//Calculating wages 
wages = RATE * hoursWorked; 
 
//Printing Name, Pay Rate, Hours worked, and Salary 
System.out.println(" Name : " + name); 
System.out.println(" PaY Rate : $" + RATE); 
System.out.println(" Hours Worked : " + hoursWorked); 
System.out.println(" Salary: $" + wages); 
} 
 }