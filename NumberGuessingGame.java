import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsPlayed = 0;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            roundsPlayed++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + roundsPlayed);
            System.out.println("I have generated a number between 1 and 100. You have " + attempts + " attempts to guess it.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts--;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    totalScore += attempts + 1; // Add remaining attempts to the score
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again. Attempts left: " + attempts);
                } else {
                    System.out.println("Too low! Try again. Attempts left: " + attempts);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have used all attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\nGame Over! You played " + roundsPlayed + " rounds with a total score of " + totalScore + ".");
        scanner.close();
    }
}
