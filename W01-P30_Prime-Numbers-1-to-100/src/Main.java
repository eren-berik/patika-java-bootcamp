/**
 * This program prints prime numbers between 1 and 100 using methods and English variables.
 * It contains two methods: printPrimeNumbers and isPrime.
 * - The printPrimeNumbers method iterates through the numbers within a given range and prints the prime numbers.
 * - The isPrime method checks whether a given number is prime or not.
 *   It returns true if the number is prime, and false otherwise.
 * Prime numbers are those numbers greater than 1 that have no positive divisors other than 1 and themselves.
 * The program demonstrates the use of methods for modular and organized code.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        printPrimeNumbers(1, 100);
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
