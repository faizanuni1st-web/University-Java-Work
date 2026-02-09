import java.util.*; 
public class Task1d{ 
      public static void main(String [] args){
          Scanner sc = new Scanner (System.in);
int num;

 System.out.print(" Enter the number of integer to find the sum of:  ");
    num = sc.nextInt();
 System.out.println();

 int count = 0;
 int sum = 0;
 
while( count < num ){
 
 System.out.println(" Enter number " + (count+1) + ": ");
  int number = sc.nextInt();
 sum += number;
 count++;
}
 
 System.out.printf(" %n The sum of these numbers is: " + sum );
 } 
  } 
  

  
 