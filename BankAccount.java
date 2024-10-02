import java.util.Scanner;

class BankingApp {
    private double balance;

    public BankingApp() {
        this.balance = 100.0;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: RM" + String.format("%.2f", balance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("RM" + String.format("%.2f", amount) + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a valid value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance to perform this withdrawal.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a valid value.");
        } else {
            balance -= amount;
            System.out.println("RM" + String.format("%.2f", amount) + " withdrawn successfully.");
        }
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingApp account = new BankingApp();

        while (true) {
           
            System.out.println("\n--- RaRa Bank ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the RaRa Bank. See yaa!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid option from the menu.");
            }
        }
    }
}
