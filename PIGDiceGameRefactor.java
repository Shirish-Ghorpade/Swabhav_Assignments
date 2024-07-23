import java.util.Random;
import java.util.Scanner;

public class PIGDiceGameRefactor {
	private static int turnScore;
	private static int finalScore;
	private static boolean turnEnded;
	private static int turn=1;
	
	
	public PIGDiceGameRefactor(int turnScore, int finalScore, boolean turnEnded) {
		PIGDiceGameRefactor.turnScore = turnScore;
		PIGDiceGameRefactor.finalScore = finalScore;
		PIGDiceGameRefactor.turnEnded = turnEnded;
	}
	
	public static void main(String[] args) {
		// Creating object of scanner class
		Scanner scanner = new Scanner(System.in);

		// creating object of random class
		Random random = new Random();

		start(scanner, random);
		
		System.out.println("You Finished in " + (turn - 1) + " turns!");
		System.out.println("Game Over!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	private static void start(Scanner scanner, Random random) {
		
		while (finalScore < 20) {
			turnScore=0;
			turnEnded=false;
			System.out.println("----------------------------------------------------");
			System.out.println("TURN " + turn);
			startNewTurn(scanner, random);
			finalScore  += turnScore;
			turn++;
		}
	}
	private static void startNewTurn(Scanner scanner, Random random) {
		
		while (!turnEnded) {
			if (finalScore + turnScore >= 20)
				break;

			System.out.println("Roll or Hold ? (r/h) ");

			String choice = scanner.next().toLowerCase();

			checkUserChoice(choice, random);
		}
	}

	private static void checkUserChoice(String choice, Random random) {
		// handle invalid case
		if (!choice.equals("r") && !choice.equals("h")) {
			System.out.println("Invalid choice. Please select r or h only");
			return;
		}
		// User choice is roll
		else if (choice.equals("r")) {
			int randomGeneratedNumberBySystem = random.nextInt(6) + 1;
			System.out.println("Die " + randomGeneratedNumberBySystem);
			operationAccordingToUserChoice(randomGeneratedNumberBySystem);
		}

		// User choose hold
		else if (choice.equals("h")) {
			// turn score and final score is printed
			System.out.println("Score for turn : " + turnScore);
			System.out.println("Total Score : " + (finalScore + turnScore));
			System.out.println("----------------------------------------------------");
			// turn is ended
			turnEnded = true;
			return;
		}

	}

	private static void operationAccordingToUserChoice(int randomGeneratedNumberBySystem) {
		if (randomGeneratedNumberBySystem == 1) {
			System.out.println("Turn Over. No score");
			System.out.println("Total Score : " + finalScore);
			turnScore=0;
			turnEnded = true;
			return;
		}
		// Die Score (randomGeneratedNumberBySystem) added in turn score
		turnScore += randomGeneratedNumberBySystem;

	}
}
