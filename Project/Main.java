import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do {

            System.out.println("\n===== SMART BANKING SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Search Account");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String holderName = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    System.out.print("Enter Interest Rate: ");
                    double rate = sc.nextDouble();

                    SavingsAccount account =
                            new SavingsAccount(accNo,
                                    holderName,
                                    balance,
                                    rate);

                    bank.addAccount(account);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(accNo, depositAmount);

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(accNo, withdrawAmount);

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    Account found = bank.searchAccount(accNo);

                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 5:

                    bank.displayAllAccounts();
                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}