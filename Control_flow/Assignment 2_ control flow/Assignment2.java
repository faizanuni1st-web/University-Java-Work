import java.util.*;
public class Assignment2 {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Main Menu (Assignment-2) ------");
            System.out.println("1 – Question-1");
            System.out.println("2 – Question-2");
            System.out.println("3 – Question-3");
            System.out.println("4 – Question-4");
            System.out.println("5 – Question-5");
            System.out.println("Press option (1 to 5) to execute the program and Press 0 to Exit");
            System.out.print("Enter your option: ");
            choice = input.nextInt();
            input.nextLine(); // clear newline
  System.out.println();

            switch (choice) {
                case 1:
                    question1(input);
                    break;
                case 2:
                    question2(input);
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4(input);
                    break;
                case 5:
                    question5(input);
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose between 0–5.");
            }
        } while (choice != 0);

        input.close();
    }
 
// -------------- Question 1 -----------------------

public static void question1(Scanner input){
    
 char repeat;
 
  do{
  System.out.println(" SSN should be in the format DDD-DD-DDDD ");
  System.out.print(" Enter a SSN: " );
  String ssn = input.nextLine();

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
 System.out.println(); 
 } 
  System.out.print("\nDo you want to execute this question again? (y for yes / b to go back): ");
            repeat = input.nextLine().toLowerCase().charAt(0);
    System.out.println();
} while (repeat == 'y');

   }

 
 // --------------- Question 2 --------------------

public static void question2(Scanner input) {
        
    char repeat;

    do{
  
  System.out.println("\n------ Executing Question - 2 ---------");  
        System.out.print("Enter two characters: ");
        String str = input.nextLine();

     boolean valid = true;
        if (str.length() != 2) {
            System.out.println("Invalid input");
            valid = false;
        }

        char major = Character.toUpperCase(str.charAt(0));
        char status = str.charAt(1);

        String majorName = "";
        String statusName = "";

        if (major == 'M')
            majorName = "Mathematics";
        else if (major == 'C')
            majorName = "Computer Science";
        else if (major == 'I')
            majorName = "Information Technology";
        else {
              valid = false;
        }

        if (status == '1')
            statusName = "Freshman";
        else if (status == '2')
            statusName = "Sophomore";
        else if (status == '3')
            statusName = "Junior";
        else if (status == '4')
            statusName = "Senior";
        else {
            valid = false;
        }

       if (valid){
        System.out.println(majorName + " " + statusName);
     } else { 
         System.out.println(" Invalid input " );
            } 
   System.out.println();
      System.out.print("\nDo you want to execute this question again? (y for yes / b to go back): ");
     repeat = input.nextLine().toLowerCase().charAt(0);
   System.out.println();
   } while (repeat == 'y');

}


// --------------------- Question 3 --------------

 public static void question3() {

  System.out.println("\n------ Executing Question - 3 ---------");  
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
         System.out.println("\nReturning to main menu...");
    
}

// ------------------- Question 4 ----------------

 public static void question4(Scanner input) {
      
   char repeat;
     do{
  System.out.println("\n------ Executing Question - 4 ---------");  
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        input.nextLine();
if (decimal == 0) {
            System.out.println("Binary value: 0");
        }

        String binary = ""; 
     while (decimal > 0) {
            int remainder = decimal % 2;    
            binary = remainder + binary;              
      decimal = decimal / 2;         
     }

        System.out.println("Binary value: " + binary);
       System.out.println();
  System.out.print("\nDo you want to execute this question again? (y for yes / b to go back): ");
      repeat = input.nextLine().toLowerCase().charAt(0);
 System.out.println();
  } while (repeat == 'y');

}


// ------------------- Question 5 -----------------

 public static void question5(Scanner input) {
       char repeat;
    
    do{
  System.out.println("\n------ Executing Question - 5 ---------");  
        int score = 0; 
        int answer;

        System.out.println("=== Global Warming Awareness Quiz ===");
        System.out.println("Type the number (1–4) for your answer.\n");

        // Question 1
        System.out.println("1. What is the main greenhouse gas produced by human activities?");
        System.out.println("1) Nitrogen");
        System.out.println("2) Oxygen");
        System.out.println("3) Carbon dioxide");
        System.out.println("4) Hydrogen");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 3) score++;

        // Question 2
        System.out.println("\n2. Which organization shared the 2007 Nobel Peace Prize with Al Gore?");
        System.out.println("1) World Health Organization (WHO)");
        System.out.println("2) Intergovernmental Panel on Climate Change (IPCC)");
        System.out.println("3) Greenpeace");
        System.out.println("4) NASA");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Question 3
        System.out.println("\n3. What do some global warming skeptics often argue?");
        System.out.println("1) The Earth is cooling, not warming");
        System.out.println("2) Climate change is caused mostly by natural cycles");
        System.out.println("3) Climate models are always 100% accurate");
        System.out.println("4) Carbon dioxide has no greenhouse effect");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Question 4
        System.out.println("\n4. Which of these is a possible consequence of global warming?");
        System.out.println("1) Rising sea levels");
        System.out.println("2) Decrease in ocean temperature");
        System.out.println("3) More stable weather");
        System.out.println("4) Less rainfall worldwide");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Question 5
        System.out.println("\n5. Which human activity contributes most to greenhouse gas emissions?");
        System.out.println("1) Deforestation and burning fossil fuels");
        System.out.println("2) Riding bicycles");
        System.out.println("3) Solar energy use");
        System.out.println("4) Planting trees");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Display result
        System.out.println("\n=== Results ===");
        System.out.println("You got " + score + " out of 5 correct.");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming!");
            System.out.println("\nHere are some helpful websites:");
            System.out.println(" https://www.ipcc.ch");
            System.out.println(" https://climate.nasa.gov");
            System.out.println(" https://www.epa.gov/climate-change");
            System.out.println(" https://www.nationalgeographic.com/environment");
        }

   input.nextLine();

     System.out.print("\nDo you want to execute this question again? (y for yes / b to go back): ");
      repeat = input.nextLine().toLowerCase().charAt(0);
   System.out.println();
        } while (repeat == 'y');
}
 }

     

       
 
  







