import java.util.Scanner;
public class MultiplicationOfMatrices {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
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
   
     //Entering elements in matrix A
     System.out.println("\nElements of Matrix A");
    
     for(int i= 0; i < r1; i++ ){
         System.out.println("Enter elements of Matrix A in row" + (i + 1));
           for(int j = 0; j < c1; j++){
               A[i][j] = sc.nextInt();

            }
        }
    
     //Entering elements in matrix B
     System.out.println("\nElements of Matrix B");

     for(int i= 0; i < r2; i++ ){
         System.out.println("Enter elements of Matrix B in row" + (i + 1));
          for(int j = 0; j < c2; j++){
              B[i][j] = sc.nextInt();

            }
        } 

     //Multiplication
     for(int i = 0; i < r1; i++){
        
         for(int j = 0; j < c2; j++){
              C[i][j] = 0;

             for(int k = 0; k < c1; k++){ 
                  C[i][j] += A[i][k] * B[k][j];
                                
                }
            }
        }
    
     System.out.println("\nResul of matrix multiplication of A and B is:");

     for(int i = 0; i < r1; i++){
          for(int j = 0; j < c2; j++){
              System.out.print(C[i][j]+ " ");
            }
             
            System.out.println();

        }
    }
}