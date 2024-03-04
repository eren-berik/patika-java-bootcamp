import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        int num = 5;

        Arrays.sort(arr);

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + findClosestLesserNumber(arr, num));
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + findClosestGreaterNumber(arr, num));
    }

    public static int findClosestLesserNumber(int[] arr, int num) {
        int closestLesserNumber = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value < num && value > closestLesserNumber) {
                closestLesserNumber = value;
            }
        }
        return closestLesserNumber;
    }

    public static int findClosestGreaterNumber(int[] array, int number) {
        int closestGreaterNumber = Integer.MAX_VALUE;
        for (int value : array) {
            if (value > number && value < closestGreaterNumber) {
                closestGreaterNumber = value;
            }
        }
        return closestGreaterNumber;
    }
}