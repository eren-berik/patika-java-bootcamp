import java.util.Scanner;

/**
 * This program prompts the user to enter a limit number and a base number.
 * Then, it calculates and prints the powers of the base number up to the limit.
 * The method findPowerOf() takes two parameters: the base number and the limit.
 * It iterates through the powers of the base number until reaching the limit and prints each power.
*/

public class Main {
    public static void main(String[] args) {
        int num, limit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the limit number: ");
        limit = sc.nextInt();

        System.out.print("Please enter the number that you want to search until the limit: ");
        num = sc.nextInt();

        findPowerOf(num, limit);
    }

    private static void findPowerOf(int num, int limit) {
        for (int i = 1; i <= limit; i*=num) {
            System.out.println(i);
        }
    }
}