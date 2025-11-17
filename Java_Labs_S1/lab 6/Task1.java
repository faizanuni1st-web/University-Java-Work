import java.util.Scanner;
public class Task1{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
int maxIndex = 0;
int index = 0;
int num;
int maxValue;
  System.out.println(" Enter the integers you want to find the index and end it with zero ");
  num = sc.nextInt();
  maxValue = num;
  
  while( num != 0){
     index++;
   num = sc.nextInt();
 if (num > maxValue){
  maxValue = num;
 maxIndex = index;
}
 }
 System.out.println(" Max index = " + ( maxIndex + 1) );
 }
  }

 
    
  

  

 

