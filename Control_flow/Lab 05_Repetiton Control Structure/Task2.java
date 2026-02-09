import java.util.*; 
public class Task2{ 
      public static void main(String [] args){
          Scanner sc = new Scanner (System.in);
int num;

 System.out.print(" Enter a positive integer to find factorial of:  ");
    num = sc.nextInt();
 System.out.println();

 int count = 1;
 int pro = 1;
while( count <= num ){
 pro = pro * count;
 count++;
}
  System.out.println(" The factorial of " + num + " is:" + pro  );
 
} 
  } 
  

  
 