package Lab8;

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Sorry, but your account is short by:$ " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
