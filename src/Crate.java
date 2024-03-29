import java.io.Serializable;

public class Crate extends Package implements Serializable{

    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/
    private float weight;
    private String content;

    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    public Crate() {
        this.trackingNumber = "N/A";
        this.specification = "N/A";
        this.mailingClass = "N/A";
        weight = (float) 0.0;
        content = "N/A";
    }

    public Crate (String trackingnumber, String spec, String mailingclass, float w, String c) {
        trackingNumber = trackingnumber;
        specification = spec;
        mailingClass = mailingclass;
        weight = w;
        content = c;
    }

    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.
        System.out.printf("| %8s   | %8s   | %11s   | %8s | %6s %5.2f  \n %63s %5s \n\n", "Crate", getTrackingNumber(), getSpef()
                , getMailingClass(), "Weight: ", getWeight(), "  Content: ", getContent());

    }

    /*************************************
     * Getters
     **************************************/
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSpef() {
        return specification;
    }

    public String getMailingClass() {
        return mailingClass;
    }

    public float getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }
}
