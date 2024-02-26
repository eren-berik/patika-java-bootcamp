import java.util.Scanner;

/*
    This Java program creates a diamond pattern using loops. The program prompts the user to enter the size
    (number of rows) of the diamond, ensuring that the size is an odd number. It then constructs the upper
    half of the diamond pattern using nested loops: the outer loop controls the rows, and the inner loops
    handle the spaces and stars in each row. After completing the upper half, the program constructs the
    lower half of the diamond using a similar approach, but in reverse order. Finally, it combines the upper
    and lower halves to form the complete diamond pattern. This program demonstrates the use of nested loops
    to generate complex patterns in Java.
*/

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the diamond (must be an odd number): ");
        size = sc.nextInt();

        if (size % 2 == 0) {
            System.out.println("Please enter an odd number!");
            return;
        }

        drawDiamond(size);
    }

    public static void drawDiamond(int size) {
        int mid = size / 2;

        for (int i = 0; i < mid + 1; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
