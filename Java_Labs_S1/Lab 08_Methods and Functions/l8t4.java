import java.util.*;
public class l8t4{
   public static int numberOfDaysInAYear(int year){

 int days;
 
 if (( year % 4 == 0 & year % 100 != 0) || ( year % 400 == 0)){

 return 366;
}
 
else { 
   return 365;
}
 }

 public static int sumOfDays(int year){
 
 

if ( year < 2000){
 System.out.println(" WRONG INPUT");
 return 0;
}
int sum = 0;


for (int i = 2000; i <= year; i++){

sum += numberOfDaysInAYear(i);;
}


return sum;
}

public static void main(String[] args){


 Scanner input = new Scanner (System.in);
System.out.print(" enter the year: ");
int year = input.nextInt();

 int days = numberOfDaysInAYear(year);
 int sum = sumOfDays(year);

System.out.println(" The number of days in year " + year + " are " + days );
System.out.println(" The sum of days from 2000 to " + year + " are " + sum );
}
 }














