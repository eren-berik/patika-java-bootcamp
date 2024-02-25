import java.util.Scanner;

/*
    This Java program calculates the power of a given base raised to the given exponent.
    It prompts the user to input the base and exponent, then calls a method to calculate
    the power. The calculatePowerOf() method computes the power using a for loop and
    returns the result. If both the base and exponent are zero, the program informs the
    user that the result is unknown. Otherwise, it displays the result of base^power.
*/

public class Main {
    public static void main(String[] args) {
        int power, base;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = sc.nextInt();

        System.out.print("Enter the power number: ");
        power = sc.nextInt();

        if (base == 0 && power == 0) {
            System.out.println(base + "^" + power + " is unknown!");
        } else {
            System.out.println(base + "^" + power + " is equal to: " + calculatePowerOf(base, power));
        }
    }

    private static int calculatePowerOf(int base, int power) {
        int result = 1;

        if (base == 0 && power == 0) {
            result = -1;
        }

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        return result;
    }
}