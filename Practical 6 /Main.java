import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private static int totalAccounts = 0;
    private static final String BANK_NAME = "ABC Bank";

    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                "Balance cannot be negative."
            );
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public final void displayDetails() {
        System.out.println("Bank Name: " + BANK_NAME);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account number: ");
            int accountNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Enter opening balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            BankAccount account =
                new BankAccount(accountNumber, balance);

            System.out.print("Enter deposit amount: ");
            double deposit = Double.parseDouble(sc.nextLine());
            account.deposit(deposit);

            System.out.print("Enter withdrawal amount: ");
            double withdrawal = Double.parseDouble(sc.nextLine());
            account.withdraw(withdrawal);

            System.out.println("\nAccount Details:");
            account.displayDetails();

            System.out.println(
                "Total Accounts: " + BankAccount.getTotalAccounts()
            );

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}
