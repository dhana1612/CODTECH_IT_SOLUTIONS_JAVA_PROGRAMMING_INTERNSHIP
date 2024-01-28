package Number_Guessing_Game;
import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int minRange = 0;
		int maxRange = 100;
		int maxAttempts = 5;
		int score = 0;
		int played = 0;
		System.out.println("Welcome to the Number Guess!!");
		for(String playAgain = "yes"; playAgain.equalsIgnoreCase("yes");played++) {
			int targetNumber = r.nextInt(maxRange - minRange +1)+minRange;
			int attempts =0;
			System.out.println("\nGuess the number between "+ minRange + " and "+ maxRange);
			while(attempts < maxAttempts) {
				System.out.println("Enter your Guess!!");
				int userGuess = sc.nextInt();
				attempts++;
		
				
				if(userGuess == targetNumber) {
					System.out.println("Congratulations! you guessed the correct number in " +attempts + " attempts.");
					score++;
					break;
				}
				else if(userGuess < targetNumber) {
					System.out.println("Too low! Try again");
				}
				else {
					System.out.println("Too high! Try again");
				}
			}
			if(attempts <= maxAttempts) {
				System.out.println("Sorry,you've run out of attempts. The correct number was : " +targetNumber);
			}
			System.out.println("Do you want to play again? (yes/no):");
			playAgain =sc.next();
		}
		System.out.println("Your Final score is: " + score);
		System.out.println("Number of Games Played: "+ played);
		System.out.println("Thanks for Playing");
		sc.close();
	}
}

