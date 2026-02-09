
public class LabExample{
 public static void main(String args[]) {

 
 
 int[][] array = {{11,12,13},{14,15,16},{17,18,19}};
System.out.println("The given 2D array is ...");
 
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++)
  System.out.print(array[i][j]+ "\t");
  System.out.println();
}
System.out.println("The prime number in 2D array are .....");
int n = 0;
for(int i=0; i<3; i++){
 for(int j=0;j<3;j++)
   if(isPrime(array[i][j])==true)
     {
        System.out.println(array[i][j]);
       n++;

 }
 
  } 
System.out.println("Total Prime Numer = "+n);
}

 static boolean isPrime( int n ){

boolean prime = true;
 for(int i=2; i<n/2; i++)
    if(n%i ==0){
     prime = false;
      break;
}
 return prime;
} 
  }

