import java.util.*;
public class l8t2 {

public static int reverse(int number){

int rev = 0;

 while (number != 0){

 int num = number % 10;
 rev = rev * 10 + num;
  number = number / 10;

}

return rev;
}
 
public static boolean isPalindrome(int number, int rev) {

return(rev == number);
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);

 System.out.print("Enter number: ");
int number = input.nextInt();

System.out.println(" reverse of this is " + reverse(number));
int rev = reverse(number);
if ( isPalindrome(number, rev)) {
System.out.println(" number is palindrome " );

}else {

System.out.println("number is not palindrome" );
}
 } 
  }






 



 