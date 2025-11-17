import java.util.*;
public class L7T2 {
      public static void main(String[] args){

           Scanner sc = new Scanner(System.in);

 System.out.print(" Enter an ASCII code: ");
      int code = sc.nextInt();

if (code < 0 || code > 127){
   System.out.println("INVALID");
}
  else { 
   char character = (char)code;
    System.out.println(" The character for ASCII code "+ code + " is " + character );
}
 }
   }