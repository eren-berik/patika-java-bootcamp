import java.util.Scanner;

/*
    Calculates body mass index, takes 2 inputs, data type of double,height and weight.
    Calculates the body mass in the calculateBodyMassIndex method.
 */

public class Main {
    public static void main(String[] args) {
        double height, weight;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();

        System.out.print("Please enter your weight in kilograms: ");
        weight = input.nextDouble();

        System.out.println("Your body mass index: " + calculateBodyMassIndex(height, weight));
    }

    private static double calculateBodyMassIndex(double height, double weight) {
        return (weight / (height * height));
    }
}