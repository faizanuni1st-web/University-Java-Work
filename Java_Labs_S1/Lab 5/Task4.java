import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break; 
            }
            count++;
        }
        
        System.out.println(count);
        scanner.close();
    }
}
