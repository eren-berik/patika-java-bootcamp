import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int degree;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the degree of the weather today in Celcius: ");
        degree = sc.nextInt();

        suggestActivity(degree);
    }

    private static void suggestActivity(int degree) {
        if (degree < 5) {
            System.out.println("You can go to skiing.");
        }

        if (degree >= 5 && degree < 15) {
            System.out.println("You can go to cinema.");
        }

        if (degree >= 15 && degree < 25) {
            System.out.println("You can go to picnic.");
        }

        if (degree >= 25) {
            System.out.println("You can go to swimming.");
        }
    }
}