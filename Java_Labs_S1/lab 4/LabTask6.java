import java.util.Scanner;

public class LabTask6 {

            public static void main(String[] args) {

int number;

 Scanner sc = new Scanner(System.in);
  
 System.out.print(" Enter an integer between 1 and 10 :  ");
        number = sc.nextInt();

switch(number) {

case 1:
     System.out.println(" Roman numeral version of this is : I");
     break;
case 2:
     System.out.println(" Roman numeral version of this is : II");
     break;
case 3:
      System.out.println(" Roman numeral version of this is : III");
     break;

case 4:
     System.out.println(" Roman numeral version of this is : IV");
     break;

case 5:
     System.out.println(" Roman numeral version of this is : V");
     break;
case 6:
     System.out.println(" Roman numeral version of this is : VI");
     break;
case 7:
     System.out.println(" Roman numeral version of this is : VII");
     break;

case 8:
     System.out.println(" Roman numeral version of this is : VIII");
     break;

case 9:
     System.out.println(" Roman numeral version of this is : IX");
     break;

case 10:
     System.out.println(" Roman numeral version of this is : X");
     break;

default:
     System.out.println(" This integer is not from 1 to 10" );
     break; 
}
 } 
  }
  



  
