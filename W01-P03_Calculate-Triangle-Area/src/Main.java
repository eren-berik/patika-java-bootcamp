import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double edgeOne, edgeTwo, edgeThree;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first edge: ");
        edgeOne = input.nextDouble();

        System.out.print("Enter the length of the second edge: ");
        edgeTwo = input.nextDouble();

        System.out.print("Enter the length of the third edge: ");
        edgeThree = input.nextDouble();

        if (isValidTriangle(edgeOne, edgeTwo, edgeThree)) {
            System.out.println("Area of the triangle: " + String.format("%.2f", calculateArea(edgeOne, edgeTwo, edgeThree)));
        } else {
            System.out.println("Is not a valid triangle");
        }
    }

    private static double calculatePerimeter(double edgeOne, double edgeTwo, double edgeThree) {
        return (edgeOne + edgeTwo + edgeThree);
    }

    private static double calculateArea(double edgeOne, double edgeTwo, double edgeThree) {
        double u = (calculatePerimeter(edgeOne, edgeTwo, edgeThree) / 2);

        return Math.sqrt(u * (u - edgeOne) * (u - edgeTwo) * (u - edgeThree));
    }

    private static boolean isValidTriangle(double edgeOne, double edgeTwo, double edgeThree) {
        if (edgeOne + edgeTwo <= edgeThree || edgeOne + edgeThree <= edgeTwo || edgeTwo + edgeThree <= edgeOne)
            return false;
        else
            return true;
    }
}