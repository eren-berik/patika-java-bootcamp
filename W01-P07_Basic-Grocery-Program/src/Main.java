import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearKg, appleKg,tomatoKg, bananaKg, eggplantKg;
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
        final double PEAR_KG_PRICE = 2.14;
        final double APPLE_KG_PRICE = 3.67;
        final double TOMATO_KG_PRICE = 1.11;
        final double BANANA_KG_PRICE = 0.95;
        final double EGGPLANT_KG_PRICE = 5.00;

        return (pearKg * PEAR_KG_PRICE) + (appleKg * APPLE_KG_PRICE) + (tomatoKg * TOMATO_KG_PRICE) +
                (bananaKg * BANANA_KG_PRICE) + (eggplantKg * EGGPLANT_KG_PRICE);
    }
}