import java.util.Scanner;


        public class SeatsTask3{
               public static void main(String[] args){


     int classa;
     int classb;
     int classc;

     Scanner console = new Scanner(System.in);

 System.out.print(" Number of student in class a  is  ");
        classa = console.nextInt();
       System.out.println();


System.out.print(" Number of student in class b is  ");
        classb = console.nextInt();
        System.out.println();



System.out.print(" Number of student in class c is  ");
       classc = console.nextInt();
     System.out.println();    


int desks= ( classa + 1 )/2 + ( classb + 1 )/2 + ( classc + 1 )/2;


System.out.println(" The Numbers of Desks that can be purchased is equal to  " + desks );

 
  console.close();
}
 }

