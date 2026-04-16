import java.util.Scanner;

public class banking_programming {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("-----------------");
            System.out.println("Banking Programming");
            System.out.println("-----------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-----------------");

            System.out.print("enter your choice(1-4):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }

        }
        System.out.println("-----------------");
        System.out.println("Thank you for using our banking program. Goodbye!");
        System.out.println("-----------------");

        scanner.close();

    }

    static void showbalance(double balance) {

        System.out.println("-----------------");
        System.out.printf("₹%.2f\n", balance);
    }

    static double deposit() {
        double Amount;
        System.out.println("Enter the amount to deposit:");
        Amount = scanner.nextDouble();
        if (Amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return 0;
        } else {
            return Amount;
        }
    }

    static double withdraw(double balance) {
        double Amount;
        System.out.println("Enter the amount to withdraw:");
        Amount = scanner.nextDouble();
        if (Amount > balance) {
            System.out.println("Insufficient balance. Please enter a smaller amount.");
            return 0;
        } else if (Amount < 0) {
            System.out.println("Invalid amount.");
            return 0;
        } else {
            return Amount;
        }

    }

}