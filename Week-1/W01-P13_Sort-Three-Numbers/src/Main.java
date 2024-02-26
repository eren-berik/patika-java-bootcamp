import java.util.Scanner;

/*
    * This Java program prompts the user to input three numbers and then sorts them in ascending order.
    * It begins by prompting the user for each number and then calls a method to sort the numbers.
    * The method first checks if all three numbers are equal; if so, it prints a message indicating that
    * they are all equal. If not, it checks if any two of the numbers are equal; if this is the case,
    * it prints a message indicating that two of the numbers are equal and cannot be sorted. Finally, if
    * none of the numbers are equal, it sorts the numbers in ascending order and prints the result.
 */

public class Main {
    public static void main(String[] args) {
        double firstNum, secondNum, thirdNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNum = sc.nextDouble();

        System.out.print("Enter the second number: ");
        secondNum = sc.nextDouble();

        System.out.print("Enter the third number: ");
        thirdNum = sc.nextDouble();

        sortNumbersInAscendingOrder(firstNum, secondNum, thirdNum);
    }

    private static void sortNumbersInAscendingOrder(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("All numbers are equal: " + a);
        } else if (a == b || a == c || b == c) {
            if (a == b && b != c) {
                System.out.println("Two numbers are equal: " + b + " = " + a + " < " + c);
            } else if (a == c && a != b) {
                System.out.println("Two numbers are equal: " + a + " = " + c + " < " + b);
            } else if (b == c && b != a) {
                System.out.println("Two numbers are equal: " + a + " < " + b + " = " + c);
            }
        } else if (a >= b && b >= c) {
            if (b >= c) {
                System.out.println(c + " < " + b + " < " + a);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if (c >= a && c >= b) {
            if (a >= b) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(a + " < " + b + " < " + c);
            }
        }
    }
}
