import java.util.*; 
public class Task3{ 
      public static void main(String [] args){
          Scanner sc = new Scanner (System.in);
 
      System.out.print("Enter how many numbers: ");
        int N = sc.nextInt();
 int count = 0;
 int i = 0;

      System.out.println("Enter " + N + " integers:");

   while (i < N) {
            int num = sc.nextInt();
            if (num == 0) {
                count++; 
 }
            i++;
        }


      System.out.println("Number of zeros = " + count);
} 
 }

   

  
 