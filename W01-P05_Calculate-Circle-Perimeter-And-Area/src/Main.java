import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        System.out.println("----- PI value taken as " + Math.PI + " -----");
        System.out.println("Results are up to 5 decimal precision\n");
        System.out.println("Perimeter of the circle: " + String.format("%.5f", calculateCirclePerimeter(radius)));
        System.out.println("Area of the circle: " + String.format("%.5f", calculateCircleArea(radius)));
    }

    private static double calculateCirclePerimeter(double radius) {
        return (Math.PI * 2 * radius);
    }

    private static double calculateCircleArea(double radius) {
        return (Math.PI * radius * radius);
    }
}