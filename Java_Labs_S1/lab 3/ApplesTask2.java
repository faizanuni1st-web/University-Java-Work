import java.util.Scanner;


        public class ApplesTask2{
               public static void main(String[] args){



           int number1;
           int number2;
       
           Scanner input = new Scanner(System.in);

       System.out.print("Enter the number of students  ");
         number1 = input.nextInt();
        System.out.println();

System.out.print(" Enter the numbers of apples  ");
       number2 = input.nextInt();
        System.out.println();


      int division= number2 / number1;
      int reminder= number2 % number1;

System.out.println(" Each student will get " + division + " apples");
System.out.println(" The number of apples remain in basket are/is  "+ reminder );

}
 }



   
        