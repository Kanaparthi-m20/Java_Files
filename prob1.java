import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int randomNum = generateRandomNumber(minRange, maxRange);
        int maxAttempts = 5;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between " + minRange + " and " + maxRange);

            while (attempts < maxAttempts) {
                int userGuess = getUserGuess(scanner);
                String result = compareGuess(randomNum, userGuess);

                System.out.println(result);

                if (result.equals("Correct")) {
                    score++;
                    break;
                }

                attempts++;
            }

            System.out.println("The correct number was: " + randomNum);
            System.out.println("Attempts: " + attempts);
            System.out.println("Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");

            if (playAgain) {
                randomNum = generateRandomNumber(minRange, maxRange);
                attempts = 0;
            }
        }

        System.out.println("Thank you for playing!");
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int getUserGuess(Scanner scanner) {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    public static String compareGuess(int randomNumber, int userGuess) {
        if (userGuess < randomNumber) {
            return "Too low";
        } else if (userGuess > randomNumber) {
            return "Too high";
        } else {
            return "Correct";
        }
    }
}
