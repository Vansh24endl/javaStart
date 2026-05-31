public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber,
                          String holderName,
                          double balance,
                          double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void calculateInterest() {

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest Earned: ₹" + interest);
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== SAVINGS ACCOUNT =====");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Holder Name    : " + getHolderName());
        System.out.println("Balance        : ₹" + getBalance());
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}