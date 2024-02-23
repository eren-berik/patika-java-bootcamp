import java.util.Scanner;

/**
 * This program prompts the user to enter a year and then determines whether the year is a leap year or not.
 * A leap year is defined as a year that is divisible by 4 but not divisible by 100, or a year that is divisible
 * by 400. The program uses a method called isLeapYear to check if the entered year satisfies the conditions
 * for a leap year, and then prints the result accordingly.
 */

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}