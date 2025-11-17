// Importing all classes from java.util 
import java.util.*; 
public class Task2{ 
public static void main(String[] arg) { 
//Declaring Variables 
int width; 
int length; 
//Reading data using Scanner class 
Scanner console = new Scanner(System.in); 
// Taking input from user 
System.out.print(" Enter the lenght: "); 
length = console.nextInt(); 
// Read Length
 System.out.println(); 
// Taking input from user  
System.out.print(" Enter the width: "); 
width = console.nextInt(); 
// Read width
 System.out.println(); 
// Declaring and initializing Area and perameter 
int area; 
area = length * width; 
int perameter; 
perameter = 2* (length + width); 
// printing Area and Perameter 
System.out.println(" Area = " + area); 
System.out.println(" perameter = " + perameter); 
} 
}