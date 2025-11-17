import java.util.*;

public class L6T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter first day of the year(1 = Sun ... 7 = Sat): ");
        int firstday = sc.nextInt();
        int daysinmonth;

        for(int month = 1; month <= 12; month++)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            switch (month) {
                case 1:
                System.out.println("January  " + year);
                    break;
                case 2:
                System.out.println("February  " + year);
                    break;
                case 3:
                System.out.println("March  " + year);
                    break;
                case 4:
                System.out.println("April  " + year);
                    break;
                case 5:
                System.out.println("May  " + year);
                    break;
                case 6:
                System.out.println("June  " + year);
                    break;
                case 7:
                System.out.println("July  " + year);
                    break;
                case 8:
                System.out.println("August  " + year);
                    break;
                case 9:
                System.out.println("September  " + year);
                    break;
                case 10:
                System.out.println("October  " + year);
                    break;
                case 11:
                System.out.println("November  " + year);
                    break;
                case 12:
                System.out.println("December  " + year);
                    break;
            
                default:
                    break;
            }
                System.out.println("---------------------------------");
                System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

                if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
                        daysinmonth = 29;
                    } else {
                        daysinmonth = 28;
                    }
                    
                } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                    daysinmonth = 30;
                } else {
                    daysinmonth = 31;
                }
            

                for(int space = 1 ; space < firstday ; space++) {
                    System.out.print("    ");
                }

                for(int day = 1 ; day <= daysinmonth ; day++) {
                    System.out.printf("%4d", day);

                    if ((firstday + day - 1) % 7 == 0) {
                        System.out.println();
                    }
                }

                firstday = (firstday + daysinmonth) % 7;
                if (firstday == 0) {
                    firstday = 7;
                }
           
        } 
        sc.close();
    }
}
