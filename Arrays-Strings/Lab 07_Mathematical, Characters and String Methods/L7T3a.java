import java.util.*;
public class L7T3a {
      public static void main(String[] args){

           Scanner sc = new Scanner(System.in);

 System.out.print(" Enter a decimal value (0 to 15): ");

   int value =sc.nextInt();
  
   if (value < 0 || value > 15){
    System.out.println(" INVALID" );
} else{
    String hex = Integer.toHexString(value).toUpperCase();
      System.out.println(" The hex value is " + hex );
   } 
     }
           }