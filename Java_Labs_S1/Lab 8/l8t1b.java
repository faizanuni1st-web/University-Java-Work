import java.util.*;
public class l8t1b{

 public static void reverse(int number){
int rev = 0;

 while (number != 0){

 int num = number % 10;
 rev = rev * 10 + num;
  number = number / 10;

}
 
 System.out.println(" the reverse of " + number + " is " + rev );
}

public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);

System.out.print(" Enter a number to reverse it: ");
 
 int number = input.nextInt();

 reverse(number);
}
 }

 
