import java.util.*;
public class BinaryCheckMatrix {
  public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
      
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


        sc.close();
        

    }
}
