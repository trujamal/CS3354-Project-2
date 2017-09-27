import java.io.Serializable;

public class Envelope extends ShippingStore implements Serializable {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private int height;      // Holds Envelopes Height in inches
    private int width;      // Holds Envelopes Width in inches


    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    /*
      Default Constructor (Initialize to "0" or "").
    */
    public Envelope(){
        super();
        height = 0;
        width = 0;
    }
    /*
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param type the item's available type (>= 0).
      @param specification the item's price (> 0.00).
      @param mailingclass the item's title.
      @param isbn the item's unique ISBN.
      @param author the item's specific author.
    */
    public Envelope(String trackingnumber, String type, String specification, String mailingclass
                float weight, int volume, ){
        super(trackingnumber, type, specification, mailingclass, weight, volume);
        this.height = height;
        this.width = width;
    }

}
