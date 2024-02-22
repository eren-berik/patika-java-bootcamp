import java.util.Scanner;

/*
    This program prompts the user to enter two numbers and choose an arithmetic operation
    It then performs the selected operation and displays the result
*/

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Please enter the second number: ");
        num2 = input.nextDouble();

        System.out.println("1 - Addition\n2 - Substraction\n3 - Multiplication\n4 - Division");
        System.out.println("Enter your choice: ");
        select = input.nextInt();

        System.out.println(calculator(select, num1, num2));
    }

    private static String calculator(int select, double num1, double num2) {
        switch(select) {
            case 1: return ("Summation: " + (num1 + num2));
            case 2: return ("Substraction: " + (num1 - num2));
            case 3: return ("Multiplication: " + (num1 * num2));
            case 4:
                if (num2 == 0) {
                    return ("Division by zero is not allowed!");
                } else {
                    return ("Division: " + (num1 / num2));
                }
            default: return ("Something went wrong!");
        }
    }
}