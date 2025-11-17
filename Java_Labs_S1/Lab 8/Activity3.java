public class Activit3 {
   public static void main(String[] args){
 int num1 = 1;
 int num2 = 2;
 
System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2 );

 swap(num1 , num2);
   System.out.println("After invokimg the swap method, num1 is " + num1 + " and num2 is " + num2);

public static void swap(int n1, intn2){
  System.out.println("\tInside the swap Method ");
  
 System.out.println("\t\tBefore swapping, n1 is " +n1 + " n2 is " + n2);

  int temp = n1;
   n1 = n2;
   n2 = temp;
System.out.println(" t\tAfter swapping n1 is "+ n1 + " n2 is " + n2);
 }
  }
  