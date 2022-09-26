package exception_handling;

public class MainAccountManager {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        accountManager.deposit(100);
        System.out.println(accountManager.getBalance());

        try {
            accountManager.withdraw(150);
            System.out.println(accountManager.getBalance());
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
