/**
 * @author Michael Servilla
 * @version date 2017-02-15
 */
public class InsufficientFundsException extends Exception {

    private double shortfall;

    /**
     * Method to return shortfall (balance - amount), if exception thrown.
     * @return Returns shortfall as a double.
     */
    public double getShortfall() {
        return shortfall;
    }

    /**
     * Construct to create InsufficientFundsException object, to thrown if
     * balance is less than amount attempted to be withdrawn.
     * @param shortfall Has double parameter, shortfall, (balance - amount).
     */
    public InsufficientFundsException(double shortfall) {
        super("Not enough money, honey!");
        this.shortfall = shortfall;


    }
}
