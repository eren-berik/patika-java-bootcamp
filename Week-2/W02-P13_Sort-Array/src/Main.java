import java.util.Arrays;
import java.util.Scanner;

/**
 * This program prompts the user to input the size of an array and then populate
 * the array with integers provided by the user. It then sorts the array in ascending
 * order using the Arrays.sort() method and prints both the original and sorted arrays.
 */


public class Main {
    public static void main(String[] args) {
        int[] arr = createAnArray();
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] sortedArr = sortArrayInAscendingOrder(arr);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(sortedArr));
    }

    public static int[] createAnArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array n: ");

        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int[] sortArrayInAscendingOrder(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}
