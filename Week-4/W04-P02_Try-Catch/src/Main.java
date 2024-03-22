import java.util.Scanner;

/*
   This Java program demonstrates the use of a try-catch block to handle ArrayIndexOutOfBoundsException.
   It prompts the user to enter an index to retrieve an element from a predefined array.
   If the entered index is valid, it displays the corresponding element.
   If the entered index is out of range, it catches the ArrayIndexOutOfBoundsException and displays an error message.
   The program continues to prompt the user for index inputs until the user chooses to exit by entering -1.
   Additionally, it defines a separate method, getElementAtIndex, to enhance code reusability and maintainability.
*/


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the index (-1 to exit): ");
            int index = sc.nextInt();
            if (index == -1) {
                System.out.println("Exiting...");
                break;
            }

            try {
                int element = getElementAtIndex(arr, index);
                System.out.println("Element in the index " + index + " is: " + element);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of range!");
            }
        }
    }

    public static int getElementAtIndex(int[] arr, int index) {
        return arr[index];
    }
}
