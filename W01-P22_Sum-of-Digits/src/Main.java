import java.util.Scanner;

/*
    This Java program prompts the user to enter a number using a Scanner object.
    It then calculates the sum of the digits of the entered number using the sumOfDigits() method.
    The sumOfDigits() method iterates through each digit of the number using a while loop,
    extracting each digit from the number, and adding it to a running total.
    Finally, it returns the total sum of the digits. The program prints the sum of digits
    along with the original number to the console. This program demonstrates the use of
    basic arithmetic operations and looping constructs in Java to perform simple mathematical tasks.
*/


public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.println("Sum of the digits of number " + num + ": " + sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        int sum = 0, temp = num, digit;

        while (temp != 0) {
            digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        return sum;
    }
}