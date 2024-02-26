import java.util.Scanner;

/**
 * This Java program determines whether a given number is a perfect number.
 * A perfect number is a positive integer that is equal to the sum of its proper divisors,
 * excluding itself.
 * The program prompts the user to enter a number and checks if it is a perfect number
 * using the method `isPerfectNumber`.
 * In the `isPerfectNumber` method, it calculates the sum of the positive divisors of the given number
 * and checks if this sum equals the number itself. If so, the number is considered a perfect number.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number!");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
