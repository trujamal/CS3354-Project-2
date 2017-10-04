import java.io.Serializable;

/**
 * Default class for package stuff
 *
 */

public abstract class Package implements Serializable{
    // Constructors
    // Getters
    String trackingNumber;
    String specification;
    String mailingClass;

    Package(){}

    abstract public String getTrackingNumber();
    abstract public String getSpef();
    abstract public String getMailingClass();

    abstract void display();


}





