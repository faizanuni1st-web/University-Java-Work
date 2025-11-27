import java.util.Scanner;

public class CafeteriaRatings {

   public static void main(String[] args ){

Scanner sc = new Scanner (System.in);

int [] ratings = new int[40];
int total = 0;
int max =Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

System.out.println(" Enter 40 ratings(1 - 10) from 40 students to rate cafetaria food: ");

//Input ratings

for (int i = 0; i < 40; i++) {
    
   ratings[i] = sc.nextInt();

  while (ratings[i] < 1 || ratings[i] > 10) {
                System.out.println("Invalid rating! Enter a number between 1 and 10:");
                ratings[i] = sc.nextInt();
            }

total += ratings[i];

if (ratings[i]> max)
 max = ratings[i];
if (ratings[i] < min)
  min = ratings[i];
}

double average = (double) total/ratings.length;

 int[] frequency = new int[11]; // 1-10 ratings
        for (int i = 0; i < ratings.length; i++) {
            frequency[ratings[i]]++;
        }


System.out.println("\nSummary of Cafeteria Ratings:");
        System.out.println("Total ratings: " + ratings.length);
        System.out.printf("Average rating: %.2f\n", average);

        System.out.println("Highest rating: " + max);
        System.out.println("Lowest rating: " + min);

        System.out.println("\nFrequency of each rating:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rating " + i + ": " + frequency[i] + " times");
        }

        sc.close();
    }
}


