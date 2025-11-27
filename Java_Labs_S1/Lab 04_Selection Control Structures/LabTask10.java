import java.util.Scanner;

public class LabTask10 {

            public static void main(String[] args) {

int number;

 Scanner sc = new Scanner(System.in);
  
 System.out.print(" Enter the number of books you purchase :  ");
        number = sc.nextInt();

if (number < 0) {
            System.out.println("Invalid input! Number of books cannot be negative.");
        } else {

switch(number) {

case 0:
     System.out.println(" You have earned 0 points");
     break;
case 1:
     System.out.println(" You have earned 5 points");
     break;
case 2:
      System.out.println(" You have earned 15 points");
     break;

case 3:
     System.out.println(" You have earned 30 points");
     break;


default:
     System.out.println(" You have earned 60 points" );
     break; 
}
 }
    sc.close();
 } 
  }
  



  
