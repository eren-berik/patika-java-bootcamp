import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilometer;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance of the travel in kilometer: ");
        kilometer = input.nextDouble();

        System.out.println("Price of the travel: " + String.format("%.2f", calculateTaximeterFare(kilometer)));
    }

    private static double calculateTaximeterFare(double kilometer) {
        final double MIN_PRICE = 20.0d;
        final double OPENING_PRICE = 10.0d;
        final double PRICE_PER_KM = 2.20d;

        if (((kilometer * PRICE_PER_KM) + OPENING_PRICE) <= MIN_PRICE) {
            return MIN_PRICE;
        }

        return ((kilometer * PRICE_PER_KM) + OPENING_PRICE);
    }
}