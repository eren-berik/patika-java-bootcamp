import java.util.Scanner;

/**
 * This program demonstrates type conversion in Java. It prompts the user to enter an integer
 * and a floating-point number. Then, it converts the integer to a double and the floating-point
 * number to an integer. Finally, it prints the converted values to the console.
 */

public class Main {
    public static void main(String[] args) {
        int integerNumber;
        double floatingNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        integerNumber = scanner.nextInt();

        System.out.print("Enter a floating number: ");
        floatingNumber = scanner.nextDouble();

        double convertedInteger = (double) integerNumber;

        int convertedDouble = (int) floatingNumber;

        System.out.println("Integer number converted to double: " + convertedInteger);
        System.out.println("Floating number converted to integer: " + convertedDouble);
    }
}
