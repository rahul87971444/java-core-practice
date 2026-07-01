class BankAccount {
    // Private data members
    private String accountHolder;
    private double balance;
    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Rahul Kumar");
        account.setBalance(5000);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
