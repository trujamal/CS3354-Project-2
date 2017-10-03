import java.util.Scanner;

public class Box extends Package {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private int largestDimension;      // Holds Boxes Largest dimension (integer number) - in inches
    private int volume;      // Volume (integer number) - in inches cubed


    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/

    public Box() {
        this.trackingNumber = "N/A";
        this.specification = "N/A";
        this.mailingClass = "N/A";
        largestDimension = 0;
        volume = 0;
    }

    /**
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param spec the Boxes Specification .
      @param mailingclass the Boxes mailing class .
      @param largestDimen the Boxes mailing largestDimension.
      @param v the Boxes mailing volume.
    */
    public Box(String trackingnumber, String spec, String mailingclass, int largestDimen, int v){
        trackingNumber = trackingnumber;
        specification = spec;
        mailingClass = mailingclass;
        largestDimension = largestDimen;
        volume = v;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/

    @Override
    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.

        System.out.printf("| %8s   | %8s   | %11s   | %8s | %6s %3d  \n %62s %3d \n\n", "Box", getTrackingNumber(), getSpef()
                       , getMailingClass(), "Dimension: ", getlargestDimension(), "  Volume: ", getVolume());

    }

    /*************************************
     * Getters
     **************************************/
    /**
        @return Returns the Box's largestDimension and volume
    */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSpef() { return specification; }

    public String getMailingClass() {
        return mailingClass;
    }

    public int getlargestDimension() {
        return largestDimension;
    }

    public int getVolume(){
        return volume;
    }


}
