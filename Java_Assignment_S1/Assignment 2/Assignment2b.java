import java.util.Scanner;
public class Assignment2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter two characters: ");
        String str = input.nextLine();

     boolean valid = true;
        if (str.length() != 2) {
            System.out.println("Invalid input");
            valid = false;
        }

        char major = Character.toUpperCase(str.charAt(0));
        char status = str.charAt(1);

        String majorName = "";
        String statusName = "";

        if (major == 'M')
            majorName = "Mathematics";
        else if (major == 'C')
            majorName = "Computer Science";
        else if (major == 'I')
            majorName = "Information Technology";
        else {
              valid = false;
        }

        if (status == '1')
            statusName = "Freshman";
        else if (status == '2')
            statusName = "Sophomore";
        else if (status == '3')
            statusName = "Junior";
        else if (status == '4')
            statusName = "Senior";
        else {
            valid = false;
        }

       if (valid){
        System.out.println(majorName + " " + statusName);
     } else { 
         System.out.println(" Invalid input " );
            }    

        input.close();
    }
}
