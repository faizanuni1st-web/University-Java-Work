import java.util.*;
public class l8t1a {

public static int sumDigit(long n){

 int sum = 0;
 
 while ( n != 0){
 
  long num = (int) n % 10;
 sum += num;
  n = n/10;
}

return sum;
}

public static void main(String[] args){

 Scanner input = new Scanner (System.in);
System.out.print(" Enter a number to find the sum of the digit ");
 long num1 = input.nextLong();
 
 System.out.println(" the sum of the digits of " + num1 + " is " + sumDigit(num1));

}
 }
 
 
 