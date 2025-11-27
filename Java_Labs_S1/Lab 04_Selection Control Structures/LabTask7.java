import java.util.Scanner;

public class LabTask7 {

            public static void main(String[] args) {

int length1;
int width1;
int length2;
int width2;

 Scanner sc = new Scanner(System.in);
  
 System.out.print(" Enter the length of 1st Rectangle : ");
        length1 = sc.nextInt();
 
 System.out.print(" Enter the width of 1st Rectangle : ");
       width1 = sc.nextInt();

 System.out.print(" Enter the length of 2nd Rectangle : ");
       length2 = sc.nextInt();

 System.out.print(" Enter the width of 2nd Rectangle : ");
       width2 = sc.nextInt();
    System.out.println();

 int area1 = length1 * width1;
 int area2 = length2 * width2;

 if( area1 > area2) {
 System.out.println(" 1st Rectangle has a greater area ");}

else if (area2 > area1 ) {
 System.out.println(" 2nd Rectangle has a greater area ");}


else {
System.out.println(" Both rectangles are equal in area ");}

 sc.close();

} 
 }
  



  
