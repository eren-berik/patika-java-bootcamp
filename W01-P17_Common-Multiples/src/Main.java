import java.util.Scanner;

/**
 * This program prompts the user to input a number and then prints out all the common multiples of 3 and 4
 * up to the entered number. It utilizes a loop to iterate through numbers from 1 to the input number,
 * checking if each number is divisible by both 3 and 4. If a number satisfies both conditions, it is printed.
*/

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        commonMultipliesOf3And4(num);
    }

    private static void commonMultipliesOf3And4(int num) {
        System.out.println("Common multipliers of 3 and 4 until " + num + " :");

        for(int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
            }
        }
    }

}