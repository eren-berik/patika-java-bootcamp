import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice, vatAmount, totalAmount;

        System.out.print("Enter the price of the item: ");
        itemPrice = input.nextDouble();
        vatAmount = calculateVatAmount(itemPrice);
        totalAmount = vatAmount + itemPrice;

        System.out.println("Price without VAT: " + String.format("%.2f", itemPrice));
        System.out.println("Price with VAT: " + String.format("%.2f", totalAmount));
        System.out.println("VAT amount: " + String.format("%.2f", vatAmount));
    }

    private static double decideVatPercentage(double itemPrice) {
        double vatThreshold = 1000.0;
        double vatPercentage;
        if (itemPrice > vatThreshold) {
            vatPercentage = 0.08;
        } else {
            vatPercentage = 0.18;
        }

        return vatPercentage;
    }

    private static double calculateVatAmount(double itemPrice) {
        return decideVatPercentage(itemPrice) * itemPrice;
    }
}
