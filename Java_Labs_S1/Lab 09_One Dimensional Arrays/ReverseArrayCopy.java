import java.util.Scanner;

public class ReverseArrayCopy {

    // Method to copy array in reverse
    public static int[] reverseCopy(int[] original) {
        int n = original.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i]; // copy from end
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call method to copy in reverse
        int[] reversedArr = reverseCopy(arr);

        // Display reversed array
        System.out.println("\nArray in reverse order:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
