public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber,
                          String holderName,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void checkOverdraft() {
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== CURRENT ACCOUNT =====");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Holder Name    : " + getHolderName());
        System.out.println("Balance        : ₹" + getBalance());
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}