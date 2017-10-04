import java.text.*;
import java.util.Date;
public class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
    }
}