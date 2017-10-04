/**
 * BadinputException is designed to catch all of our wonderful exception
 */

public class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
        System.out.println(message);
    }
}