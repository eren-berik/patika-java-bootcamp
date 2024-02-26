import java.util.Scanner;

/**
 * This program simulates a simple banking system where users can log in with a username and password,
 * perform various transactions such as deposit, withdrawal, and check balance.
 * Users have three attempts to log in with correct credentials, after which the account gets blocked.
 * The initial balance is set to 1500.
 * Once logged in successfully, users can perform transactions until they choose to logout.
 * The program utilizes a switch statement to handle different user actions.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        // Loop until the user runs out of login attempts or logs in successfully
        while (right > 0) {
            System.out.print("Username: ");
            String userName = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            // Validate user credentials
            switch (validateCredentials(userName, password)) {
                case 0:
                    System.out.println("Wrong credentials. Please try again.");
                    right--;
                    if (right == 0) {
                        System.out.println("Account blocked due to too many failed login attempt. Please contact with customer service.");
                    } else {
                        System.out.println("Remaining login attempt(s) : " + right);
                    }
                    break;
                case 1:
                    System.out.println("Hi, welcome to Patika Bank!");

                    // Perform banking transactions
                    performTransactions(balance);
                    System.out.println("See you!");
                    return;
            }
        }
    }

    // Method to validate user credentials
    private static int validateCredentials(String userName, String password) {
        if (userName.equals("patika") && password.equals("dev123")) {
            return 1;
        } else {
            return 0;
        }
    }

    // Method to perform banking transactions
    private static void performTransactions(int balance) {
        Scanner sc = new Scanner(System.in);
        int select, price;

        // Loop until the user chooses to logout
        do {
            System.out.println("""
                    1- Deposit
                    2- Withdraw
                    3- Balance Details
                    4- Logout""");
            System.out.print("Please enter the process that you want to perform: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter the amount: ");
                    price = sc.nextInt();
                    balance += price;
                    System.out.println("Your balance: " + balance + "\n");
                    break;
                case 2:
                    System.out.print("Enter the amount: ");
                    price = sc.nextInt();
                    if (price > balance) {
                        System.out.println("Insufficient balance\n");
                    } else {
                        balance -= price;
                        System.out.println("Your balance: " + balance + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Your balance: " + balance + "\n");
                    break;
            }
        } while (select != 4);
    }
}
