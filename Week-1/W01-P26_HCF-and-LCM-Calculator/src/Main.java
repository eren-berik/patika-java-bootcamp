import java.util.Scanner;

/**
 * This program calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using a
 * while loop. The user is prompted to enter two integers, and the program then finds their GCD and LCM using
 * the Euclidean algorithm for GCD and the formula LCM(a, b) = (a * b) / GCD(a, b). The GCD is calculated iteratively
 * using the while loop until both numbers become equal, while the LCM is calculated by dividing the product of the
 * two numbers by their GCD. The program then displays the calculated GCD and LCM to the user.
 */

public class Main {
    public static void main(String[] args) {
        int greatestCommonDivisor, leastCommonMultiple;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        greatestCommonDivisor = findGreatestCommonDivisor(num1, num2);
        leastCommonMultiple = findLeastCommonMultiple(num1, num2);

        System.out.println("Highest common factor: " + greatestCommonDivisor);
        System.out.println("Least common multiple: " + leastCommonMultiple);
    }

    public static int findGreatestCommonDivisor(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }

    public static int findLeastCommonMultiple(int num1, int num2) {
        return (num1 * num2) / findGreatestCommonDivisor(num1, num2);
    }
}
