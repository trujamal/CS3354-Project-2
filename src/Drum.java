import java.util.Scanner;

public class Drum extends Package {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/
    private String material;
    private float diameter;
    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    public Drum() {
        this.trackingNumber = "N/A";
        this.speficiation = "N/A";
        this.mailingClass = "N/A";
        material = "N/A";
        diameter = (float) 0.0;
    }

    public Drum(String trackingnumber, String spec, String mailingclass, String m, float d) {
        trackingNumber = trackingnumber;
        speficiation = spec;
        mailingClass = mailingclass;
        material = m;
        diameter = d;
    }

    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.
        System.out.println("Drum" + " " + getTrackingNumber() + " " + getSpef()+ " " + getMailingClass() + " " + getMaterial() + " " + getDiameter());
    }

    /*************************************
     * Getters
     **************************************/
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSpef() {
        return speficiation;
    }

    public String getMailingClass() {
        return mailingClass;
    }

    public String getMaterial() {
        return material;
    }

    public float getDiameter() {
        return diameter;
    }
}
