import java.util.Scanner;

/**
 * This program determines whether a given number is a prime number or not using a recursive approach.
 * It prompts the user to input a number, then checks if the number is prime by calling the isPrimeNumber
 * method with initial parameters (num, 2), where num is the number to be checked and 2 is the initial value
 * of the divisor. The isPrimeNumber method recursively checks if the number is divisible by any integer
 * starting from 2 up to the square root of the number. If the number is divisible by any integer other than
 * 1 and itself, it returns false, indicating that the number is not prime. If no divisors are found,
 * it returns true, indicating that the number is prime.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        if (isPrimeNumber(num, 2))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static boolean isPrimeNumber(int num, int i) {
        if (num <= 2)
            return num == 2;

        if (num % i == 0)
            return false;

        if (i * i > num)
            return true;

        return isPrimeNumber(num, i + 1);
    }
}