


public class LabTask1 {

            public static void main(String[] args) {
	
        int x = 10;
        int y = 15;
        int z = 20;

	
     boolean expr1 = ! (x > 10);
     boolean expr2 = x <= 5 || y < 15 ;
     boolean expr3 = (x != 5 ) && (y != z) ;
     boolean expr4 = x >= z || ( x + y >= z );
     boolean expr5 = (x <= y -2 ) && (y >= z ) || ( z-2 != 20 );



System.out.println(" Expression 1 : " + expr1 );
System.out.println(" Expression 2 : " + expr2 );
System.out.println(" Expression 3 : " + expr3 );
System.out.println(" Expression 4 : " + expr4 );
System.out.println(" Expression 5 : " + expr5 );

}
 }
