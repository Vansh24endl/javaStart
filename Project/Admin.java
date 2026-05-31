public class Admin {

    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {

        return this.username.equals(username)
                && this.password.equals(password);
    }

    public void displayBankStats(Bank bank) {

        System.out.println("\n===== ADMIN PANEL =====");
        System.out.println("Total Customers : "
                + bank.getTotalCustomers());
    }
}