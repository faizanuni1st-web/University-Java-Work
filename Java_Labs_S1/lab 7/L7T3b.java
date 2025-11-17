import java.util.*;
public class L7T3b{
   public static void main(String[] args);{
 
  Scanner sc = new Scanner(System.in);

 System.out.print(" Enter a hex digit: ");
 
 String s = sc.next().toUpperCase();

if (s.length()!= 1 || !"0123456789ABCDEF".contains(s)){

     System.out.println("INVALID");
}else {
int decimal = Integer.parseInt(s,16);
String binary = Integer.toBinaryString(decimal);
 System.out.println("The binary value is " + binary);
}
 }
  }