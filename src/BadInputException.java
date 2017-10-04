import java.io.IOException;

public class BadInputException extends Exception {

    public BadInputException () {
        super();
    }


    public BadInputException(String s) {
        super(s);
    }

    public BadInputException(Throwable cause) {
        super (cause);
    }


    public BadInputException(String message, Throwable throwable) {
        super(message, throwable);
    }


}
