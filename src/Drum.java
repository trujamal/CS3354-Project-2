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
        this.specification = "N/A";
        this.mailingClass = "N/A";
        material = "N/A";
        diameter = (float) 0.0;
    }

    public Drum(String trackingnumber, String spec, String mailingclass, String m, float d) {
        trackingNumber = trackingnumber;
        specification = spec;
        mailingClass = mailingclass;
        material = m;
        diameter = d;
    }

    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.
        //System.out.println("Drum" + " " + getTrackingNumber() + " " + getSpef()+ " " + getMailingClass() + " " + getMaterial() + " " + getDiameter());
          System.out.printf("| %8s | %8s   | %11s   | %8s | %6s %30d  \n %60s %5d \n\n", "Drum", getTrackingNumber(), getSpef()
                , getMailingClass(), "Material: ", getMaterial(), "  Diameter: ", getDiameter());

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

    public String getMaterial() {
        return material;
    }

    public float getDiameter() {
        return diameter;
    }
}
