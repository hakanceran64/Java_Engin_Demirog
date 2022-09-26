package exception_handling;

public class AccountManager {
    private double balance;

    public void  deposit (double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if(balance > amount) {
            balance -= amount;
        } else {
            throw new BalanceInsufficentException("Bakiye yetersiz.");
            // throw new Exception("Bakiye yetersiz.");
        }
    }

    public double getBalance () {
        return balance;
    }

}