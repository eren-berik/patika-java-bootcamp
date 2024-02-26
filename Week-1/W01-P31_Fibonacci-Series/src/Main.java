import java.util.Scanner;

/**
 * This program calculates and prints the Fibonacci series up to a specified number of elements,
 * taking the count of elements from the user. The Fibonacci series is a sequence of numbers where each
 * number is the sum of the two preceding ones, starting with 0 and 1. The program first prompts the user
 * to enter the number of elements in the series. Then, it uses loops to calculate and print the Fibonacci
 * series up to the specified count. It handles edge cases where the count is less than 1 by not printing
 * anything and cases where the count is 1 or 2 by printing the initial elements of the series (0 and 1).
 */
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        num = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(num);
    }

    public static void printFibonacciSeries(int num) {
        int first = 0, second = 1;

        if (num >= 1) {
            System.out.print(first + " ");
        }
        if (num >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
