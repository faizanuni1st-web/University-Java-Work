import java.util.Scanner;

public class MilkTask5 {
    
       public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);

     
System.out.print(" Enter the amount of litters of milk produced in the morning  ");

   double amount = input.nextDouble();
       System.out.println();


 double cartons = amount/3.78;


  double cost   = amount * 0.38;

  double profit = cartons * 0.27; 

System.out.printf(" milk cartons = " + " %.2f %n",cartons);

System.out.println(" milk cost    = " + cost   );

System.out.println(" milk profit  = " + profit );

   input.close();
}
 }




  
 

  




