import java.util.Scanner;

public class MaxPrimeCount {
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] rowPrimeCount = new int[3];
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (isPrime(matrix[i][j])) {
                    count++;
                }
            }
            rowPrimeCount[i] = count;
        }

        int maxRowCount = rowPrimeCount[0];
        int maxRowIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (rowPrimeCount[i] > maxRowCount) {
                maxRowCount = rowPrimeCount[i];
                maxRowIndex = i;
            }
        }

        int[] colPrimeCount = new int[4];
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (isPrime(matrix[i][j])) {
                    count++;
                }
            }
            colPrimeCount[j] = count;
        }

        int maxColCount = colPrimeCount[0];
        int maxColIndex = 0;

        for (int j = 1; j < 4; j++) {
            if (colPrimeCount[j] > maxColCount) {
                maxColCount = colPrimeCount[j];
                maxColIndex = j;
            }
        }

        System.out.println("\nRow with maximum prime numbers: Row " + (maxRowIndex + 1) + " (Count = " + maxRowCount + ")");

        System.out.println("Column with maximum prime numbers: Column " + (maxColIndex + 1) + " (Count = " + maxColCount + ")");
    }
}
