import java.util.Scanner;

/**
 * This program calculates the result of a base number raised to a power using a recursive approach.
 * It prompts the user to input the base number and the power, then calculates and prints the result of
 * base^power using a recursive method named pow. The pow method recursively multiplies the base number
 * by itself power times, and returns the result. If the power is 0, the method returns 1, as any number
 * raised to the power of 0 is 1.
 */

public class Main {
    public static void main(String[] args) {
        int base, power;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = sc.nextInt();

        System.out.print("Enter the power number: ");
        power = sc.nextInt();

        System.out.println("Result of " + base + "^" + power + " : " + pow(base, power));
    }

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }

        return (base * pow(base, power - 1));
    }
}