import java.util.Scanner;
 public class Answer10{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter total miles per day: ");
        double miles = sc.nextDouble();

    System.out.print("Enter cost per gallon: ");
        double cost = sc.nextDouble();

    System.out.print("Enter average miles per gallon: ");
        double mpg = sc.nextDouble();

    System.out.print("Enter parking fees per day: ");
        double park = sc.nextDouble();

    System.out.print("Enter tolls: ");
        double toll = sc.nextDouble();

        double fuel = (miles / mpg) * cost;
        double total = fuel + park + toll;

        System.out.printf("Fuel: Rs %.2f%n", fuel);
        System.out.printf("Parking: Rs %.2f%n", park);
        System.out.printf("Tolls: Rs %.2f%n", toll);
        System.out.printf("Total: Rs %.2f%n", total);
   sc.close();
    }
}
