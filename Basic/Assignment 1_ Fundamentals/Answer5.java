import java.util.Scanner;

public class Answer5{
    public static void main(String[] args) {
    

  int solar;
  int company;

   Scanner sc = new Scanner(System.in);

System.out.print(" Enter the number of units consumed from solar system: " );
      solar = sc.nextInt();
System.out.print(" Enter the number of units consumed from the electric company: ");
      company = sc.nextInt();
     System.out.println();


int solarBill = solar * 7;
int companyBill = company * 60;
int totalBill = solarBill + companyBill;

int save = ( solar + company )* 60;
int savings = save - totalBill;


System.out.println(" Total bill if all units were from company is: Rs" + save);
System.out.println(" Your actual bill is: Rs" + totalBill);
System.out.println(" Your total saving is: Rs" + savings);

}
 } 














   
