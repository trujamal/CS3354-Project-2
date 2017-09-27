import java.io.Serializable;

public class Envelope extends PackageOrder implements Serializable {
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
      Default Constructor (Initialize to "0")
    */
    public Envelope(){
        super();
        height = 0;
        width = 0;
    }
    /*
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param specification the envelopes Specification .
      @param mailingclass the envelopes mailing class .
      @param height the envelopes mailing height.
      @param width the envelopes mailing width.
    */
    public Envelope(String trackingnumber, String specification, String mailingclass,
                 int height, int width ){
        super(trackingnumber, specification, mailingclass);
        this.height = height;
        this.width = width;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.
        super.display();
        System.out.println("Height: " + height);
        System.out.println();
        System.out.println("Width " + width);
    }
    /*************************************
     * Getters
     **************************************/
    /*
        @return Returns the Envelope's Height and Width
    */
    public int getHeight() {
        return height;
    }

    public int getWidth(){
        return width;
    }



}
