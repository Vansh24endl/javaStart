import java.time.LocalDateTime;

public class Transaction {

    private String transactionId;
    private String transactionType;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(String transactionId,
                       String transactionType,
                       double amount) {

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void displayTransaction() {

        System.out.println("\n----- Transaction -----");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Type           : " + transactionType);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Date & Time    : " + dateTime);
    }
}