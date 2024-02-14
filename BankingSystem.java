import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

class Transaction {
    public static void transfer(Account source, Account destination, double amount) {
        if (amount > 0 && source.getBalance() >= amount) {
            source.withdraw(amount);
            destination.deposit(amount);
            System.out.println("Transferred $" + amount + " from account " + source.getAccountNumber() +
                    " to account " + destination.getAccountNumber());
        } else {
            System.out.println("Invalid transfer between accounts");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("12345", 1000.0);
        Account account2 = new Account("67890", 500.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        Scanner scanner = new Scanner(System.in);

        // Simulate banking transactions
        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Transfer\n4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter account number: ");
            String accountNumber = scanner.next();

            Account selectedAccount = bank.findAccount(accountNumber);

            if (selectedAccount == null) {
                System.out.println("Account not found.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    selectedAccount.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.print("Enter destination account number: ");
                    String destinationAccountNumber = scanner.next();
                    Account destinationAccount = bank.findAccount(destinationAccountNumber);

                    if (destinationAccount == null) {
                        System.out.println("Destination account not found.");
                        continue;
                    }

                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    Transaction.transfer(selectedAccount, destinationAccount, transferAmount);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
