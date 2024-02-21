import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        c = input.nextDouble();

        System.out.println("Result of a+b*c-b is: " + calculate(a, b, c));
    }

    private static double calculate(double a, double b, double c) {
        return a + b * c - b;
    }
}