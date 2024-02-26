import java.util.Scanner;

/**
 * This program allows users to input a specified number of values and then determines the minimum and maximum values among those inputs.
 * Initially, it prompts the user to specify how many numbers they intend to enter. Then, it initializes variables to hold the minimum and maximum values,
 * setting them to the maximum and minimum possible integer values, respectively. It iterates through each input, updating the minimum and maximum values
 * based on the current input using the `updateMinMaxValues` method. After processing all inputs, it displays the determined minimum and maximum values to the user.
 * This approach enhances efficiency by updating the min and max values within a separate method, making the main code more organized and readable.
 */

public class Main {
    public static void main(String[] args) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter?: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            int[] updatedValues = updateMinMaxValues(number, minValue, maxValue);
            minValue = updatedValues[0];
            maxValue = updatedValues[1];
        }

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }

    public static int[] updateMinMaxValues(int number, int minValue, int maxValue) {
        if (number < minValue) {
            minValue = number;
        }

        if (number > maxValue) {
            maxValue = number;
        }

        return new int[]{minValue, maxValue};
    }
}
