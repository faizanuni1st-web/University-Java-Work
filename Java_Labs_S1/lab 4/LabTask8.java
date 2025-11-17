import java.util.Scanner;

public class LabTask8 {

            public static void main(String[] args) {

int day;
int month;
int year;

 Scanner sc = new Scanner(System.in);
  
 System.out.print(" Enter the day in numeric values : ");
        day = sc.nextInt();
 
 System.out.print(" Enter the month in numeric values : ");
       month = sc.nextInt();

 System.out.print(" Enter the last two digits of year : ");
       year = sc.nextInt();
         System.out.println();

 int prod = day * month;
 

 if( prod == year) {
 System.out.println(" The date is magical ");}


else {
System.out.println(" The date is not magical ");}

 sc.close();

} 
 }
  



  
