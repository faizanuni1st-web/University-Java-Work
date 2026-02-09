public class ArrangeABC {
    public static void main(String[] args){
       
        char[] my_Array = {'b','c','a','b','c','a','b','a'};

        arrangeABC(my_Array);

        System.out.println("Array after arranging:");
        for (char ch : my_Array) {
            System.out.print(ch + " ");
        }
    }

    public static void arrangeABC(char[] arr){
      
       int countA = 0, countB = 0, countC = 0;
        
      for (char ch : arr) {
            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else if (ch == 'c') countC++;
        }

        int index = 0;

        for (int i = 0; i < countA; i++)
            arr[index++] = 'a';

        for (int i = 0; i < countB; i++)
            arr[index++] = 'b';

        for (int i = 0; i < countC; i++)
            arr[index++] = 'c';    
    
    
    }
    
    
}
