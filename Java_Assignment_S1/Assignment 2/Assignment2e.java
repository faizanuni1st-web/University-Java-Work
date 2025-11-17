import java.util.Scanner;

public class Assignment2e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        input.close();
    }
}
