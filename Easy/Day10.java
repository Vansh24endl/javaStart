public class BankAccount {
    public String customerName;
    private String accountNumber;
    private double balance;
    private int pin;

    public BankAccount(String customerName, String accountNumber, double balance, int pin) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void printDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Debited: " + amount);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited: " + amount);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "123456789", 1000.0, 1234);
        BankAccount account2 = new BankAccount("Jane Smith", "987654321", 2000.0, 5678);

        account1.printDetails();
        account2.printDetails();
    }
}