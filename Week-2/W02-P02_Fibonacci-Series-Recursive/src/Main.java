import java.util.Scanner;

/*
    This Java program takes an input number from the user and prints the Fibonacci series up to that number.
    It first prompts the user to enter a number. Then, it iterates from 1 to the input number and calls the
    fibonacciSeries method for each iteration to calculate and print the corresponding Fibonacci number.
    The fibonacciSeries method recursively computes the nth Fibonacci number. Finally, the program prints
    the Fibonacci series up to the entered number.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.println("Fibonacci series up to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }

    public static int fibonacciSeries(int num) {

        if (num == 1 || num == 2) {
            return 1;
        }

        return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
    }

}