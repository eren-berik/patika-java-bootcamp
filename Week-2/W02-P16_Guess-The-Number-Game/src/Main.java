import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program is a number guessing game where the player needs to guess a randomly generated number
 * between 0 and 99. The player has 5 attempts to guess the number correctly. If the input is invalid,
 * the program informs the player and deducts one attempt. After 5 incorrect attempts, the player loses
 * the game. At the end of the game, it displays whether the player won or lost, and in case of losing,
 * it also shows the incorrect guesses made by the player.
 */

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = generateRandomNumber(rand, 100);
        Scanner input = new Scanner(System.in);
        playGame(input, number);
    }

    public static int generateRandomNumber(Random rand, int bound) {
        return rand.nextInt(bound);
    }

    public static void playGame(Scanner input, int number) {
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (!isValidInput(selected)) {
                handleInvalidInput(isWrong, right);
                isWrong = true;
                continue;
            }

            if (selected == number) {
                System.out.println("Congrats! Your guess is right, number is: " + number);
                isWin = true;
                break;
            } else {
                handleIncorrectGuess(selected, number, wrong, right);
                right++;
                System.out.println("Remaining right: " + (5 - right));
            }
        }

        if (!isWin) {
            handleGameLost(isWrong, wrong);
        }
    }

    public static boolean isValidInput(int selected) {
        return selected >= 0 && selected <= 99;
    }

    public static void handleInvalidInput(boolean isWrong, int right) {
        System.out.println("Please enter a number between 0-100");
        if (isWrong) {
            System.out.println("Too many wrong input. Remaining right: " + (5 - right));
        } else {
            System.out.println("If you enter a number outside of the range (0-100) your rights will start to decrease!");
        }
    }

    public static void handleIncorrectGuess(int selected, int number, int[] wrong, int right) {
        System.out.println("Incorrect guess!");
        if (selected > number) {
            System.out.println(selected + " is greater than the hidden number.");
        } else {
            System.out.println(selected + " is lesser than the hidden number.");
        }

        wrong[right] = selected;
    }

    public static void handleGameLost(boolean isWrong, int[] wrong) {
        System.out.println("You lost!");
        if (!isWrong) {
            System.out.println("Your guesses: " + Arrays.toString(wrong));
        }
    }
}
