import java.util.Scanner;

/*
    This Java program calculates the combination (n choose r) given the number of elements in a set (n)
    and the number of elements to select (r). It prompts the user to input these values and then calls
    a method to calculate the combination. The calculateCombination() method uses the factorial function
    to compute the combination formula C(n, r) = n! / (r! * (n-r)!). The calculateFactorial() method is
    responsible for computing the factorial of a given number. The program then displays the result to
    the user.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the set: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of elements to select: ");
        int r = scanner.nextInt();

        double combination = calculateCombination(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + combination);

        scanner.close();
    }

    public static long calculateCombination(int n, int r) {
        if (r > n) {
            return 0;
        } else {
            return calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        }
    }

    public static long calculateFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
