import java.util.Scanner;

/**
 * This program calculates the price of a travel ticket based on the distance of the travel, the passenger's age,
 * and whether the travel is one-way or round-trip. The price calculation includes discounts for age and round-trip
 * travels. The user is prompted to enter the distance of the travel in kilometers, their age, and their choice of
 * travel type (one-way or round-trip). The program then calculates the ticket price using a fixed price per kilometer
 * and applies age and round-trip discounts if applicable. If the inputs are invalid (e.g., negative values, age older
 * than 120, or invalid choice), the program informs the user about the invalid inputs. The program uses helper methods
 * to calculate age discounts, round-trip discounts, validate inputs, and calculate the ticket price accordingly.
 */

public class Main {
    // Constant representing the price per kilometer
    final static double PRICE_PER_KM = 0.1;

    // Constants representing discount rates for different age groups
    final static double NO_DISCOUNT_RATE = 1;
    final static double TEN_PERCENT_DISCOUNT_RATE = 0.9;
    final static double TWENTY_PERCENT_DISCOUNT_RATE = 0.8;
    final static double THIRTY_PERCENT_DISCOUNT_RATE = 0.7;
    final static double FIFTY_PERCENT_DISCOUNT_RATE = 0.5;

    // Constant representing the multiplier for round-trip travels
    final static int ROUND_TRIP_MULTIPLIER = 2;

    public static void main(String[] args) {
        double distance, ticketPrice;
        int age, choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter distance of the travel in km: ");
        distance = sc.nextDouble();

        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        System.out.print("Is your travel one-way or round-trip? (1 => One-way , 2 => Round-trip): ");
        choice = sc.nextInt();

        ticketPrice = calculateTicketPrice(distance, age, choice);

        if (ticketPrice != -1) {
            System.out.println("Total price of the ticket is: " + String.format("%.2f", ticketPrice) + " TL");
        } else {
            System.out.println("Inputs are invalid.\n- All input must be positive.\n- Age cannot be older than 120.\n- Choice must be either 1 or 2.");
        }
    }

    private static double calculateAgeDiscountRate(int age) {

        if (age < 12) {
            return FIFTY_PERCENT_DISCOUNT_RATE;
        }

        if (age < 24) {
            return TEN_PERCENT_DISCOUNT_RATE;
        }

        if (age > 65) {
            return THIRTY_PERCENT_DISCOUNT_RATE;
        }

        return NO_DISCOUNT_RATE;
    }

    private static double calculateRoundTripDiscount(int choice) {
        if (choice == 2) {
            return TWENTY_PERCENT_DISCOUNT_RATE;
        }

        return NO_DISCOUNT_RATE;
    }

    private static boolean isInputValid(double distance, int age, int choice) {
        if (distance > 0 && age > 0 && choice > 0) {
            return age <= 120 && choice <= 2;
        }

        return false;
    }

    private static double calculateTicketPrice(double distance, int age, int choice) {
        if (isInputValid(distance, age, choice)) {
            if (choice == 2) {
                return (distance * PRICE_PER_KM * calculateAgeDiscountRate(age) * calculateRoundTripDiscount(choice) * ROUND_TRIP_MULTIPLIER);
            }
            return (distance * PRICE_PER_KM * calculateAgeDiscountRate(age) * calculateRoundTripDiscount(choice));
        }

        return -1;
    }
}