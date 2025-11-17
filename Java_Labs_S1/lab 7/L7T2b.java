import java.util.*;
public class L7T2b {
      public static void main(String[] args){

           Scanner sc = new Scanner(System.in);

 System.out.print(" Enter a character: ");
     char abc = sc.next().charAt(0);

    int code = (int) abc;

  System.out.println("The Unicode for the character " + abc + " is " + code);
}
 }
