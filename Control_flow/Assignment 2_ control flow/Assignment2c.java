public class Assignment2c {
    public static void main(String[] args) {

        String plate = "";
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + (int)(Math.random() * 26));
            plate += letter;
        }

       for (int i = 0; i < 4; i++) {
           int digit = (int)(Math.random() * 10);
           plate += digit;
        }

        System.out.println("Generated plate number: " + plate);
    }
}
