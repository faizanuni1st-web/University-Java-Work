import java.util.*;
public class Assignment2a {
     public static void main(String[] args){
    
 Scanner sc = new Scanner(System.in);
 
 System.out.println(" SSN should be in the format DDD-DD-DDDD ");
 System.out.print(" Enter a SSN: " );
  String ssn = sc.nextLine();

  boolean valid = true;
 
 if(ssn.length() != 11){
   valid = false;
} else { 
   
   int i = 0;
  while (i < 11){
  
  char ch = ssn.charAt(i);
 
 if(i == 3 || i == 6){
    if(ch != '-' ){
   valid = false;
 break;
}

} else {
    if(ch < '0' || ch > '9'){
      valid = false;
      break;
}
 }
i++; 
 }
  }
if( valid ){
 
 System.out.print( ssn + " is a valid SSN ");
 } else {
  
 System.out.println( ssn + " is an invalid SSN "); 
 }
   } 
    } 

















 
