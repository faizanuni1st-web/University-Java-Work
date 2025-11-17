import java.util.Scanner;

public class ClockTask4 {
    
       public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);


System.out.print(" Givne the number of minutes that had passed since midnight  ");
          int N = input.nextInt();
            System.out.println();


int hours    =  (N/60)% 24;

int minutes  =   N % 60;


 System.out.println( hours + " " + minutes);

    input.close();

}
 } 

 
