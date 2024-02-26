import java.util.Scanner;

/**
 * This program implements various arithmetic operations such as addition, subtraction, multiplication, division,
 * exponentiation, factorial calculation, modulus, and rectangle perimeter and area calculation.
 * The user is presented with a menu to choose the desired operation, and the program prompts for necessary input
 * based on the selected operation. Each operation is implemented as a separate method to enhance modularity and readability.
 */

public class Main {

    static void addition() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void subtraction() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Cannot divide by 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number :");
        int num2 = scan.nextInt();

        int result = num1 % num2;

        System.out.println("Result : " + result);
    }

    static void rectanglePerimeterAndArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the long edge :");
        int longEdge = scan.nextInt();

        System.out.print("Enter the length of the short edge :");
        int shortEdge = scan.nextInt();

        if (longEdge <= 0 || shortEdge <= 0) {
            System.out.println("Length of the edges cannot be zero or negative!");
        }

        int perimeter = 2 * (longEdge + shortEdge);
        int area = longEdge * shortEdge;

        System.out.println("Rectangle area : " + area + "\nRectangle perimeter : " + perimeter);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulus\n"
                + "8- Rectangle Perimeter and Area Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectanglePerimeterAndArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, please try again.");
            }
        } while (select != 0);
    }
}
