import java.io.Serializable;

public class Envelope extends Package implements Serializable {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private int height;      // Holds Envelopes Height in inches
    private int width;      // Holds Envelopes Width in inches

    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    public Envelope() {
        this.trackingNumber = "N/A";
        this.specification = "N/A";
        this.mailingClass = "N/A";
        this.height = 0;
        this.width = 0;
    }

    /**
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param spec the envelopes Specification .
      @param mailingclass the envelopes mailing class .
      @param h the envelopes mailing height.
      @param w the envelopes mailing width.
    */
    public Envelope(String trackingnumber, String spec, String mailingclass, int h, int w){
        trackingNumber = trackingnumber;
        specification = spec;
        mailingClass = mailingclass;
        height = h;
        width = w;

    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    public void display() {

        //Display's universal attributes in addition to
        // Envelope's specific attributes.
        System.out.printf("| %8s   | %8s   | %11s   | %8s |  %6s %5d  \n %62s %5d \n\n", "Envelope", getTrackingNumber(), getSpef()
                           , getMailingClass(), "Height: ", getHeight(), "  Width: ", getWidth());
     }
    /*************************************
     * Getters
     **************************************/
    /*
        @return Returns the Envelope's Height and Width
    */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSpef() {
        return specification;
    }

    public String getMailingClass() {
        return mailingClass;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth(){
        return width;
    }



}
