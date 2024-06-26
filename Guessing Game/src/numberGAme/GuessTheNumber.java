package numberGAme;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	int rounds = 3; // rounds
	int maxattempts = 5; //attempts
	int score  = 0; 
	
	System.out.println("Guess The Number Game");
	
	//function for game Structure
	for(int round = 1;round<=rounds;round++) {
		int targetNumber = rand.nextInt(100)+1;
		int attempts = 0;
		int roundScore = 0;
		boolean guessed = false;
		
		System.out.println("\nRound " + round + " of " + rounds +  ". Try to guess the number between 1 and 100.");
		
		//function for Game
		while(attempts < maxattempts &&!guessed) {
			System.out.print("Enter Your Guess: ");
			int userGuess  = scan.nextInt();
			attempts++;
			
			//Game Performance
			
		if(userGuess == targetNumber) {
			guessed = true;
			roundScore = 100 - (attempts - 1)*10; //Scoring Calculation
			score+=roundScore;
			  System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts. You score " + roundScore + " points.");
		}else if(userGuess < targetNumber) {
			System.out.println("Too Low! Try again.");
		}else {
			System.out.println("Too High!! Try again.");
		}
		}
		
		if(!guessed) {
			System.out.println("You've used all your attempts. The correct number was " + targetNumber + ".");
		}
	}
	 System.out.println("\nGame Over! Your total score is: " + score);
     scan.close();
	}

}
