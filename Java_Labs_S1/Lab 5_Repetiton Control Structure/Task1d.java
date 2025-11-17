import java.util.*; 
public class Task1d{ 
      public static void main(String [] args){
          Scanner sc = new Scanner (System.in);
int num;

 System.out.print(" Enter the number of integer to find the sum of their  cubes:  ");
    num = sc.nextInt();
 System.out.println();

 int count = 0;
 int sum = 0;
 
while( count < num ){
 
 System.out.print(" Enter number " + (count+1) + ": ");
  int number = sc.nextInt();
 sum += number * number * number;
 count++;
}
 
 System.out.printf(" %n The sum of the cubes of these numbers is: " + sum );
 } 
  } 
  

  
 