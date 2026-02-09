import java.io.*;

public class Question1 {
    public static void main(String[] args) {
        File file = new File("Text_IO.txt");

        try {
            // PrintWriter with FileOutputStream in append mode
            PrintWriter output = new PrintWriter(new FileOutputStream(file, true));

            // Write 100 random integers separated by spaces
            for (int i = 0; i < 100; i++) {
                int num = (int)(Math.random() * 1000); // random 0–999
                output.print(num + " ");
            }

            output.close();
            System.out.println("100 random integers written to Text_IO.txt");

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
