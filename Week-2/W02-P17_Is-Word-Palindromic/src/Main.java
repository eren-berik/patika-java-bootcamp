import java.util.Scanner;

/*
* This program prompts the user to enter a word and checks whether the word is a palindrome or not.
* A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward
* and backward. The program uses a method called isPalindromic to determine if the input string is
* a palindrome. It iterates through the characters of the string from both ends towards the middle,
* comparing each pair of characters. If all pairs match, the method returns true indicating that the
* string is a palindrome; otherwise, it returns false. Finally, the program prints the result to the user.
*/

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        str = sc.nextLine();

        if(isPalindromic(str)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }

    public static boolean isPalindromic(String str) {
        int right = 0;
        int left = str.length() - 1;

        while (right < left) {
            if (str.charAt(right) == str.charAt(left)) {
                right++;
                left--;
            } else {
                return false;
            }
        }
        return true;
    }
}