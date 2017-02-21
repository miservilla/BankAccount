/**
 * Program to test use of exception handling in the form of a bank account using
 * deposit and withdrawal schema.
 * @author Michael Servilla
 * @version date 2017-02-15
 */
public class BankAccount {

    private int accountID;
    private double balance = 0;

    /**
     * Method to get the account ID number.
     * @return Returns the account ID number as an integer.
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Method to get current account balance.
     * @return Returns account balance as a double.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method to deposit money into account and update balance, does not return
     * any value.
     * @param depositAmount Amount of deposit in form of a double.
     */
    public void deposit(double depositAmount) {
        balance = getBalance() + depositAmount;
    }

    /**
     * Method to withdraw money from the account. Checks to be sure that there
     * are sufficient funds, and if not throws exception.
     * @param amount Amount of withdrawal in form of a double.
     * @throws InsufficientFundsException Throws exception if amount is greater
     * than current balance.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
    }

    /**
     * Constructor for bank account object.
     * @param accountID Accound ID as an int.
     */
    public BankAccount(int accountID) {
        this.accountID = accountID;
    }
}