

public class Answer9{
    public static void main(String[] args) {

      
        double P = 1200000;                  
        double annualRate = 0.12;       
        int years = 5;                  


        double r = annualRate / 12;     
        int n = years * 12;             


        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

       
        System.out.println("Loan Amount: RS"+ P);
       
        System.out.println("Loan Period: " + years + " years or " + n + " months" );
        System.out.printf("Monthly Installment: Rs %.2f%n", payment);
    }
}


