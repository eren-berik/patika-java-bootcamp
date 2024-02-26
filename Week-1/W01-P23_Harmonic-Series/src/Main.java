import java.util.Scanner;

/*
    This Java program calculates the harmonic series of a given number entered by the user.
    Harmonic series is defined as the sum of the reciprocals of integers from 1 to n.
    The program prompts the user to input a number, then computes the harmonic series
    using a loop that iterates from 1 to the input number. Inside the loop, it adds the
    reciprocal of each integer to a running total. Finally, the program displays the
    result, which is the sum of the harmonic series, to the user. This program demonstrates
    the use of loops and arithmetic operations in Java to perform mathematical calculations.
*/

public class Main {
    public static void main(String[] args) {
        int num;
        double harmonicSum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        harmonicSum = calculateHarmonicSeries(num);
        System.out.println("Harmonic series of the number " + num + ": " + harmonicSum);

    }

    public static double calculateHarmonicSeries(int num) {
        double sum = 0.0;

        for (int i = 1; i <= num; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
