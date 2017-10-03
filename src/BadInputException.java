import java.text.*;
import java.util.Date;

public class BadInputException extends Exception {

    public BadInputException () {
        super();
    }


    public BadInputException(String s) {
        super(s);
    }


    public BadInputException(String message, Throwable throwable) {
        super(message, throwable);
    }

    void forInputString(String s) {
        System.out.println("For input string: \"" + s + "\"");
    }

    public String getMessage() {
        return super.getMessage();
    }
}

