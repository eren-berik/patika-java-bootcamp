import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int index, element;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the index (-1 to exit): ");
            index = sc.nextInt();

            if (index == -1) {
                System.out.println("Exitting...");
                break;
            }

            try {
                element = arr[index];
                System.out.println("Element in the index " + index + " is " + element);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of range!");
            }
        }
    }


}