import java.util.Scanner;

/*
 * This Java program checks whether a given number is a palindrome or not.
 * It prompts the user to enter a number and then calls the isPalindrome() method
 * to determine if the number is a palindrome. The isPalindrome() method
 * reverses the given number and checks if the reversed number is equal to the original number.
 * If they are equal, the number is considered a palindrome, and the program
 * prints a message indicating so; otherwise, it prints a message indicating
 * that the number is not a palindrome.
 */

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = sc.nextInt();

       if (isPalindrome(num)) {
           System.out.println(num + " is a palindrome number.");
       } else {
           System.out.println(num + " is not a palindrome number.");
       }
    }

    public static boolean isPalindrome(int num) {
        int temp = num, lastDigit, reverseNum = 0;

        while (temp != 0) {
            lastDigit = temp % 10;
            temp /= 10;
            reverseNum = (reverseNum * 10) + lastDigit;
        }

        return (reverseNum == num);
    }
}