import java.util.*;

public class AssignmentMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Question 1: Multiply Two Matrices");
            System.out.println("2. Question 2: Binary Check Matrix");
            System.out.println("3. Question 3: Arrange a,b,c");
            System.out.println("4. Question 4: Array Operations Menu (Question 4)");
            System.out.println("5. Question 5: Energy Grid Optimization");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    MultiplicationOfMatrices(sc);
                    break;

                case 2:
                    BinaryCheckMatrix(sc);
                    break;

                case 3:
                    ArrangeABC();
                    break;

                case 4:
                    MenuArrayOperations(sc);
                    break;

                case 5:
                    EnergyGridOptimization();
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

    // -------------------- Question 1 --------------------
    public static void MultiplicationOfMatrices(Scanner sc) {
      
        System.out.print("Enter number of rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("\nMatrix multiplication NOT possible!");
            System.out.println("Columns of Matrix A must equal rows of Matrix B.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("\nElements of Matrix A");
        for (int i = 0; i < r1; i++) {
            System.out.println("Enter elements of row " + (i + 1));
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nElements of Matrix B");
        for (int i = 0; i < r2; i++) {
            System.out.println("Enter elements of row " + (i + 1));
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nResult of matrix multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }


    // -------------------- Question 2 --------------------
  public static void BinaryCheckMatrix(Scanner sc){
      
     System.out.print("Enter the size of the Square matrix: ");
     int n = sc.nextInt();

     int[][] matrix = new int[n][n];

     for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){
              matrix[i][j] = (int)(Math.random()*2);
            }
        }
        //printing matrix
        System.out.println("\nGenerated matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        //checks rows
        boolean rowFound = false;
        for (int i = 0; i < n; i++) {
            boolean allZero = true;
            boolean allOne = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) allOne = false;
                if (matrix[i][j] == 1) allZero = false;
            }
            if (allZero) {
                System.out.println("All 0s on row " + (i+1));
                rowFound = true;
            }
            if (allOne) {
                System.out.println("All 1s on row " + (i+1));
                rowFound = true;
            }
        }
        if (!rowFound) {
          System.out.println("No same numbers on a row");
        }

        // checks colomn
       boolean colFound = false;
        for (int j = 0; j < n; j++) {
            boolean allZero = true;
            boolean allOne = true;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 0) allOne = false;
                if (matrix[i][j] == 1) allZero = false;
            }
            if (allZero) {
                System.out.println("All 0s on column " + (j+1));
                colFound = true;
            }
            if (allOne) {
                System.out.println("All 1s on column " + (j+1));
                colFound = true;
            }
        }
        if (!colFound) System.out.println("No same numbers on a column"); 
        

        //check Major diagnol
        boolean allZeroMajor = true;
        boolean allOneMajor = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] == 0) allOneMajor = false;
            if (matrix[i][i] == 1) allZeroMajor = false;
        }
        if (allZeroMajor) {
            System.out.println("All 0s on the major diagonal");
        }    
        else if (allOneMajor) {
            System.out.println("All 1s on the major diagonal");
        }    
        else{
             System.out.println("No same numbers on the major diagonal");
        }

        // Check sub-diagonal
        boolean allZeroSub = true;
        boolean allOneSub = true;
        for (int i = 0; i < n; i++) {
            if (matrix[i][n - 1 - i] == 0) allOneSub = false;
            if (matrix[i][n - 1 - i] == 1) allZeroSub = false;
        }
        if (allZeroSub) {
            System.out.println("All 0s on the sub-diagonal");
        } 
        
        else if (allOneSub){
             System.out.println("All 1s on the sub-diagonal");
        } 
        else {
            System.out.println("No same numbers on the sub-diagonal");
        }


        
    }


    // -------------------- Question 3 --------------------
    public static void ArrangeABC() {
        char[] myArray = {'b', 'c', 'a', 'b', 'c', 'a', 'b', 'a'};

        System.out.println("Before arranging:");
        for (char ch : myArray) System.out.print(ch + " ");
        System.out.println();

        int countA = 0, countB = 0, countC = 0;

        for (char ch : myArray) {
            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else if (ch == 'c') countC++;
        }

        int index = 0;
        for (int i = 0; i < countA; i++) myArray[index++] = 'a';
        for (int i = 0; i < countB; i++) myArray[index++] = 'b';
        for (int i = 0; i < countC; i++) myArray[index++] = 'c';

        System.out.println("Array after arranging:");
        for (char ch : myArray) System.out.print(ch + " ");
        System.out.println();
    }
    

    // --------------------Question 4 ---------------------
    public static void MenuArrayOperations(Scanner sc) {
        

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
    
    

         

    

    // -------------------- Question 5 --------------------
    public static void EnergyGridOptimization() {

        int[][] grid = {
                {120, 200, 150},
                {180, 250, 300},
                {170, 160, 140}
        };

        int threshold = 200;
        int rows = grid.length, cols = grid[0].length;
        int[][] updatedGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                updatedGrid[i][j] = grid[i][j];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (grid[i][j] > threshold) {
                    int sum = 0, count = 0;
                    if (i - 1 >= 0) { sum += grid[i - 1][j]; count++; }
                    if (i + 1 < rows) { sum += grid[i + 1][j]; count++; }
                    if (j - 1 >= 0) { sum += grid[i][j - 1]; count++; }
                    if (j + 1 < cols) { sum += grid[i][j + 1]; count++; }
                    updatedGrid[i][j] = sum / count;
                }

        System.out.println("Original Grid:");
        for (int[] row : grid) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        System.out.println("\nOptimized Grid:");
        for (int[] row : updatedGrid) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}

