package OOPS_Keywords_Instances;

public class BankAccount {
    private String accountHolderName;
    private final String accountNumber; // final
    private double balance;

    private static String bankName = "State Bank of India"; // static
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName; // this
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // instanceof
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}
