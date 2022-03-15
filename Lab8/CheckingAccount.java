package Lab8;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class CheckingAccount {
    private double Balance = 10000;
    private int accountNumber;

    public CheckingAccount(double Balance, int Number) {
        this.Balance = Balance;
        this.accountNumber = Number;
    }

    public void deposit(double amount) {
        if (amount <=0)
        {
            throw new IllegalArgumentException("Amount must be greater than $0");
        }
        else
        {
            this.Balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        BigDecimal zero = new BigDecimal(0);
        if(amount <=0)
        {
            throw new IllegalArgumentException("Amount must be greater than $0");
        }
        if (Balance - amount < 0) {
            throw new InsufficientFundsException(amount - Balance);
        }
        else {
            this.Balance -= amount;
        }

    }

    public double getBalance() {
        return Balance;
    }

    public int getNumber() {
        return accountNumber;
    }

}
