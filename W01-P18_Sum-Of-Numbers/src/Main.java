import java.util.Scanner;

/**
 * This program continuously prompts the user to enter a number until an odd number is input.
 * For each entered number, it checks if it is divisible by 4. If so, it adds it to the running sum.
 * The loop terminates when an odd number is entered. Finally, it prints the sum of all numbers
 * that are multiples of 4 entered before the odd number.
 * Note: No need to check if number is even or not as multiple of 4 will always be even.
*/

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);

        System.out.println("Sum of multiples of 4: " + sum);
    }
}
