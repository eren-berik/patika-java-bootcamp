/**
 * This program calculates the harmonic mean of an array of numbers and prints the result.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Harmonic Mean: " + calculateHarmonicMean(numbers));
    }

    public static double calculateHarmonicMean(int[] arr) {
        double sum = 0;
        for (double element : arr) {
            sum = sum + (1 / element);
        }

        return sum;
    }
}