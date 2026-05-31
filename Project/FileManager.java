import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveAccounts(Bank bank) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("accounts.txt"));

            for (Account account : bank.getAccounts()) {

                writer.write(
                        account.getAccountNumber()
                        + ","
                        + account.getHolderName()
                        + ","
                        + account.getBalance());

                writer.newLine();
            }

            writer.close();

            System.out.println("Accounts Saved Successfully!");

        } catch (IOException e) {

            System.out.println("Error Saving File!");
        }
    }
}