import java.util.*;
public class IncomeTax {
     
      public static void main(String[] args){

             Scanner sc = new Scanner(System.in);
  
   double monthlySalary;
    boolean report = true;  

   double ai;
   double net;
   double tax;
   double mtax;


  

   
 while (report){

  System.out.print(" Enter your monthly salary (0 to exit): ");
    monthlySalary = sc.nextInt();

       System.out.println();
      System.out.println();


       ai = monthlySalary * 12;



    net = 0.0;
  tax = 0.0; 
  mtax = 0.0;
  
   


  if ( monthlySalary == 0 ){
       report = false;
        break;
   }


  if (ai < 600000){
           tax = ai * 0.0;
         
   } else if (ai >= 600000 && ai <= 1200000){
           tax = ai * 0.01;
      
   } else if (ai > 1200000 && ai <= 2200000){
       tax = 6000 + (( ai - 1200000) * 0.11);
      


   } else if (ai > 2200000 && ai <= 3200000){
       tax = 116000 + (( ai - 2200000) * 0.23);
       

   } else if( ai > 3200000 && ai<= 4100000){
        tax = 346000 + ((ai - 2200000) * 0.30);
      


   } else if( ai > 4100000 ){
      tax =  616000 + ((ai - 4100000) * 0.35);
        
     } else { 
       System.out.println(" Wrong input! ");
   }
     
       mtax = tax/12;
      net = monthlySalary - mtax;
  
    

    System.out.println(" Annual Income: " + ai );
   System.out.println(" Anual Tax :  " + tax );
   System.out.println(" Monthly Tax Deduction: " + mtax);
   System.out.println(" Net Monthly Salary: " + net);
      System.out.println(); 
    
   System.out.println("-----------------------------------------");
       
    System.out.println();
    System.out.println();
    System.out.println();

}

}
 }
 
  
        
               
  

   

