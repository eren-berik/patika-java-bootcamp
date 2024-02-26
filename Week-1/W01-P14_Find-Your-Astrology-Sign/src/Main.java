import java.util.Scanner;

/*
 * This Java program prompts the user to input their birth month and day. It then validates the input to ensure
 * that the entered date is valid. If the date is valid, it determines the user's astrology sign based on their
 * birth month and day and prints the result. The isValidDate method checks if the entered month is between 1 and 12
 * and if the day is valid for that month. The findYourAstrologySign method determines the astrology sign based on
 * the month and day provided. The program informs the user of their astrology sign according to their birthdate.
 */

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your birth month: ");
        month = sc.nextInt();

        System.out.print("Please enter your birth day: ");
        day = sc.nextInt();

        if (isValidDate(month, day)) {
            findYourAstrologySign(month, day);
        } else {
            System.out.print("Entered date is not valid!");
        }

    }

    private static boolean isValidDate(int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day < 1 || day > 31) {
                return false;
            }
            return true;
        }

        else if (month == 2) {
            if (day < 1 || day > 29) {
                return false;
            }
            return true;
        }

        else {
            if (day < 1 || day > 30) {
                return false;
            }
            return true;
        }
    }

    private static void findYourAstrologySign(int month, int day) {
        if (month == 1) {
            if (day <= 21) {
                System.out.println("You are Capricorn!");
            } else {
                System.out.println("You are Aquarius!");
            }
        }

        if (month == 2) {
            if (day <= 19) {
                System.out.println("You are Aquarius!");
            } else {
                System.out.println("You are Pisces!");
            }
        }

        if (month == 3) {
            if (day <= 20) {
                System.out.println("You are Pisces!");
            } else {
                System.out.println("You are Aries!");
            }
        }

        if (month == 4) {
            if (day <= 20) {
                System.out.println("You are Aries!");
            } else {
                System.out.println("You are Taurus!");
            }
        }

        if (month == 5) {
            if (day <= 21) {
                System.out.println("You are Taurus!");
            } else {
                System.out.println("You are Gemini!");
            }
        }

        if (month == 6) {
            if (day <= 22) {
                System.out.println("You are Gemini!");
            } else {
                System.out.println("You are Cancer!");
            }
        }

        if (month == 7) {
            if (day <= 22) {
                System.out.println("You are Cancer!");
            } else {
                System.out.println("You are Leo!");
            }
        }

        if (month == 8) {
            if (day <= 22) {
                System.out.println("You are Leo!");
            } else {
                System.out.println("You are Virgo!");
            }
        }

        if (month == 9) {
            if (day <= 22) {
                System.out.println("You are Virgo!");
            } else {
                System.out.println("You are Libra!");
            }
        }

        if (month == 10) {
            if (day <= 22) {
                System.out.println("You are Libra!");
            } else {
                System.out.println("You are Scorpio!");
            }
        }

        if (month == 11) {
            if (day <= 21) {
                System.out.println("You are Scorpio!");
            } else {
                System.out.println("You are Sagittarius!");
            }
        }

        if (month == 12) {
            if (day <= 21) {
                System.out.println("You are Sagittarius!");
            } else {
                System.out.println("You are Capricorn!");
            }
        }
    }
}