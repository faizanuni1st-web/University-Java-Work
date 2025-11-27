import java.util.Scanner;
public class MaximumSum {
 public static void main(String arg[]){

Scanner input=new Scanner(System.in);
int matrix[][]=new int[3][4];

for(int i=0;i<3; i++){
System.out.println("Enter array elements of row "+(i+1));
for (int j=0;j<4;j++){
  
matrix[i][j] = input.nextInt();
}
 }

int[] array1 = new int[3];
int sum;

for(int i=0; i<3; i++){
 sum=0;
 for(int j =0; j<4; j++){

  sum+=matrix[i][j];
}
array1[i]=sum;
}

int largest1 = array1[0];
int rowIndex = 0;

for(int i=1; i<3; i++){

 if (array1[i]>largest1){
 largest1 = array1[i];
 rowIndex = i;

}
 }


int[] array2 = new int[4];
int sum2 = 0;

for (int j = 0; j<4; j++){
 
sum2=0;
  for(int i=0; i<3; i++){

 sum2 += matrix[i][j];
}

array2[j] = sum2;
}

int largest2 = array2[0];
int colIndex = 0;

for (int j = 1; j < 4; j++) {
if (array2[j]>largest2){
 largest2 = array2[j];
 colIndex = j;
  }
    }

System.out.println("Row with the largest sum is row " + (rowIndex + 1) +" with sum = " + largest1);

System.out.println("Column with the largest sum is column " + (colIndex + 1) + " with sum = " + largest2);

} 
 }

