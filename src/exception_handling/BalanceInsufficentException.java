package exception_handling;

public class BalanceInsufficentException extends  Exception {
    String message;

    public BalanceInsufficentException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
        // return super.getMessage();
    }
}
