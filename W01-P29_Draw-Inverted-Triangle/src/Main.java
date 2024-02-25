import java.util.Scanner;

/**
 * This program prompts the user to enter a number representing the height of an inverted triangle.
 * It then draws an inverted triangle using asterisks '*' with the specified height.
 * The drawInvertedTriangle method takes an integer parameter 'num', which determines the height of the triangle.
 * Inside the method, a nested loop structure is used to iterate through rows and columns to print the asterisks.
 * The outer loop controls the number of rows, and the inner loop controls the number of asterisks printed in each row.
 * As the outer loop progresses, the number of asterisks printed decreases, creating the inverted triangle shape.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        drawInvertedTriangle(num);
    }

    public static void drawInvertedTriangle(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = num; j > 0; j--) {
                System.out.print("*");
            }
            num--;
            System.out.print("\n");
        }
    }
}