import java.util.Scanner;

public class ArrayModify {

   public static int[] modify(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i] * 3;
    }
    return newArr;
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 elements
        System.out.println("Enter 10 integer elements:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        numbers = modify(numbers);


       
        System.out.println("\nArray elements after modification:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
