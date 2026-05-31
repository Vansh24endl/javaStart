import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Create Account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account Created Successfully!");
    }

    // Search Account
    public Account searchAccount(String accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }

    // Display All Accounts
    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No Accounts Found!");
            return;
        }

        for (Account account : accounts) {
            account.displayDetails();
        }
    }

    // Deposit
    public void deposit(String accountNumber, double amount) {

        Account account = searchAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Withdraw
    public void withdraw(String accountNumber, double amount) {

        Account account = searchAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Total Customers
    public int getTotalCustomers() {
        return accounts.size();
    }

    // Get Accounts List
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}