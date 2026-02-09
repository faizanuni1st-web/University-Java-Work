import java.util.*;
public class l8t5{
 public static int countLetters(String s){

 int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

 public static void main (String[] args ){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a string: " );
String s = sc.nextLine();

int count = countLetters(s);

System.out.println("The numbers of letter in the string is: " + count);
}
 }