import java.util.Scanner;

/*
 * This Java program prompts the user to enter a username and password.
 * It then verifies whether the entered username and password match predefined values.
 * If the username is correct but the password is incorrect, it offers the user the option to reset their password.
 * If the user chooses to reset the password, it initiates the password reset process.
 * If the username is incorrect, it notifies the user.
 * Login handled by the login() method. Checking username and password conditions handled in there.
 * Reset password handled by the resetPassword() method. Checking conditions of new password handled in there.
 */

public class Main {
    public static void main(String[] args) {
       String inputUsername, inputPassword, username = "patika-dev", password = "1234";
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        inputUsername = sc.nextLine();

        System.out.print("Enter your password: ");
        inputPassword = sc.nextLine();

       login(username, password, inputUsername, inputPassword);
    }

    private static void login(String username, String password, String inputUsername, String inputPassword) {
        Scanner sc = new Scanner(System.in);

        if (inputUsername.equals(username)) {
            if (inputPassword.equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password. Do you want to reset it? (Y/N)");
                String resetOption = sc.nextLine();
                if (resetOption.equalsIgnoreCase("Y")) {
                    System.out.println("Password reset is initiated.");
                    resetPassword(password, inputPassword);
                } else {
                    System.out.println("Password reset cancelled.");
                }
            }
        } else {
            System.out.println("Incorrect username!");
        }
    }

    private static void resetPassword(String password, String inputPassword) {
        String newPassword;
        Scanner sc = new Scanner(System.in);

       while (true) {
            System.out.print("Please enter you new password: ");
            newPassword = sc.nextLine();

            if (newPassword.equals(password)) {
                System.out.println("Your new password cannot be same as your old password.");
            } else if (newPassword.equals(inputPassword)) {
                System.out.println("Your new password cannot be the same as the password you entered incorrectly.");
            } else {
                password = newPassword;
                System.out.println("Password reset successful!");
                break;
            }
       }
    }
}
