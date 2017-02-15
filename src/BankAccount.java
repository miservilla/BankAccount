/**
 * @author Michael Servilla
 * @version date 2017-02-15
 */
public class BankAccount {

    private int accountID = 0;
    private double balance;

    public int getAccountID() {
        return accountID;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;


    }
}