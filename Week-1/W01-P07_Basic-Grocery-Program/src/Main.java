import java.util.Scanner;

/**
 * This program calculates the total price of groceries based on the user input for the kilograms of various items.
 * The user is prompted to enter the weight of pears, apples, tomatoes, bananas, and eggplants, and the program
 * computes the total cost by multiplying the weights with predefined prices per kilogram.
 * The constants for prices per kilogram are defined at the class level.
 */

public class Main {
    // Define constant variables
    private static final double PEAR_KG_PRICE = 2.14;
    private static final double APPLE_KG_PRICE = 3.67;
    private static final double TOMATO_KG_PRICE = 1.11;
    private static final double BANANA_KG_PRICE = 0.95;
    private static final double EGGPLANT_KG_PRICE = 5.00;

    public static void main(String[] args) {
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms of pears?: ");
        pearKg = input.nextDouble();

        System.out.print("How many kilograms of apples?: ");
        appleKg = input.nextDouble();

        System.out.print("How many kilograms of tomatoes?: ");
        tomatoKg = input.nextDouble();

        System.out.print("How many kilograms of bananas?: ");
        bananaKg = input.nextDouble();

        System.out.print("How many kilograms of eggplants?: ");
        eggplantKg = input.nextDouble();

        System.out.println("Total Amount : " + String.format("%.2f",
                calculateTotalPriceOfGroceries(pearKg, appleKg, tomatoKg, bananaKg, eggplantKg)));
    }

    private static double calculateTotalPriceOfGroceries(double pearKg, double appleKg, double tomatoKg,
                                                         double bananaKg, double eggplantKg) {
        return (pearKg * PEAR_KG_PRICE) + (appleKg * APPLE_KG_PRICE) + (tomatoKg * TOMATO_KG_PRICE) +
                (bananaKg * BANANA_KG_PRICE) + (eggplantKg * EGGPLANT_KG_PRICE);
    }
}