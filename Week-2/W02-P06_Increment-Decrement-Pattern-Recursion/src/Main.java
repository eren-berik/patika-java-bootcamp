import java.util.Scanner;

/**
 * This program prompts the user to enter a number and then prints a specific pattern based on that number.
 * The main method reads the input number from the user and calls the printPattern method with that number.
 * The printPattern method recursively prints the given number and decrements it by 5 each time until it reaches 0 or negative.
 * During the recursion, the number is printed both before and after the recursive call, creating a specific pattern.
 * Once the recursion reaches 0 or negative, the method prints the current number again during the backtracking phase.
 * This process continues until all recursive calls have been resolved, resulting in the complete pattern being printed.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        printPattern(num);
    }

    public static void printPattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            printPattern(n - 5);
            System.out.print(n + " ");
        }
    }
}