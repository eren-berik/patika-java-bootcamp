/**
 * This program finds duplicate even numbers in an array of integers.
 * It iterates through the array, checks each even number, and determines if it has duplicates.
 * If a duplicate even number is found, it is printed to the console.
 *
 * Loop Explanation:
 *
 * 1. Outer Loop (for i): This loop iterates over each element of the array.
 *    - It starts from the first element (index 0) and continues until the last element of the array.
 *
 * 2. Inner Loop (for j): This loop iterates over the elements before the current element (i-th element).
 *    - It checks if the current number has been encountered before in the array.
 *    - If a duplicate even number is found, it sets the isDuplicate flag to true and breaks out of the loop.
 *
 * Inside the outer loop:
 *
 * 3. Check for Even Numbers:
 *    - Within the outer loop, it checks if the current number is even.
 *    - If the current number is even, it proceeds to check for duplicates.
 *
 * 4. Second Inner Loop (for k):
 *    - If the current number is even and not a duplicate, it starts another loop.
 *    - This loop iterates over the elements after the current element (i-th element) to find duplicates.
 *    - If a duplicate even number is found, it prints the number to the console and breaks out of the loop.
 *
 * This algorithm efficiently identifies duplicate even numbers by using nested loops.
 */


public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 2, 4, 6, 5, 7, 8, 9, 8, 105454, 400445, 105454};

        findDuplicateEvenNumbers(numbers);
    }

    public static void findDuplicateEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber % 2 == 0) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == currentNumber) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    for (int k = i + 1; k < numbers.length; k++) {
                        if (numbers[k] == currentNumber) {
                            System.out.println(currentNumber + " has duplicates.");
                            break;
                        }
                    }
                }
            }
        }
    }
}
