/**
 * Default class for package stuff
 *
 */

public abstract class Package {
    // Constructors
    // Getters
    String trackingNumber;
    String specification;
    String mailingClass;

    Package(){}

    abstract String getTrackingNumber();
    abstract String getSpef();
    abstract String getMailingClass();

    abstract void display();


}





