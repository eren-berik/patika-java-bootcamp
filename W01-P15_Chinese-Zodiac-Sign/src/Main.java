import java.util.Scanner;

/**
 * This program prompts the user to enter their birth year and then determines their Chinese zodiac sign based on
 * the Chinese zodiac cycle, which repeats every 12 years. The user's birth year is divided by 12, and the remainder
 * determines their zodiac sign. The program uses a switch statement to map the remainder to the corresponding zodiac
 * sign and prints the result. The Chinese zodiac signs are: Monkey, Rooster, Dog, Pig, Rat, Ox, Tiger, Rabbit,
 * Dragon, Snake, Horse, and Goat.
 */

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        year = sc.nextInt();

        findYourChineseZodiacSign(year);
    }

    private static void findYourChineseZodiacSign(int year) {
        int remaining = year % 12;

        switch (remaining) {
            case 0:
                System.out.println("Your Chinese zodiac sign: Monkey");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign: Rooster");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign: Dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign: Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign: Rat");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign: Ox");
                break;
            case 6 :
                System.out.println("Your Chinese zodiac sign: Tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign: Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign: Dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign: Snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign: Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign: Goat");
                break;
        }
    }
}