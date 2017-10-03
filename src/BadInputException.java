public class BadInputException extends Exception {

    public String getMessage() {
        return super.getMessage();
    }

    public BadInputException(String message) {
        super(message);
    }

    public BadInputException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
