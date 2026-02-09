import java.util.Scanner;

public class MenuArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Count occurrences of a number");
            System.out.println("2. Partition around first element");
            System.out.println("3. Display duplicates with frequency");
            System.out.println("4. Circular sum replace");
            System.out.println("5. Shift circularly left by 2 positions");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number to count: ");
                    int x = sc.nextInt();
                    count(arr, x);
                    break;

                case 2:
                    partition(arr);
                    System.out.println("Array after partition:");
                    printArray(arr);
                    break;

                case 3:
                    duplicates(arr);
                    break;

                case 4:
                    circular(arr);
                    System.out.println("Array after circular sum replace:");
                    printArray(arr);
                    break;

                case 5:
                    shiftCircular(arr);
                    System.out.println("Array after shift:");
                    printArray(arr);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
     
    // Method 1: Count occurrences
    public static void count(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) count++;
        }
        System.out.println("Occurrences of " + x + " = " + count);
    }

    
    // Method 2: Partition around first element
    public static void partition(int[] arr) {
        int fix = arr[0];
        int left = 1, right = arr.length - 1;

        while (left <= right) {
            while (left <= right && arr[left] < fix) left++;
            while (left <= right && arr[right] > fix) right--;

            if (left <= right) {   // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Place pivot at correct position
        int temp = arr[0];
        arr[0] = arr[right];
        arr[right] = temp;
    }


    // Method 3: Display duplicates with frequency
    public static void duplicates(int[] arr) {
        boolean[] seen = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (seen[i]) continue;

            int freq = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    seen[j] = true;
                    freq++;
                }
            }

            System.out.println(arr[i] + " occurs " + freq + " times");
        }

    } 


    // Method 4: Circular sum replace
    public static void circular(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + 1) % n] + arr[(i + 2) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }   
    
    
    // Method 5: Shift circularly left by 2 positions
    public static void shiftCircular(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + 2) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }    



    // Print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    
}
