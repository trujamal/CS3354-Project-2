import java.io.Serializable;
import java.util.Scanner;

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
    public Envelope()
    {}


    /**
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param specification the envelopes Specification .
      @param mailingclass the envelopes mailing class .
      @param height the envelopes mailing height.
      @param width the envelopes mailing width.
    */
    public Envelope(String trackingnumber, String specification, String mailingclass, int height, int width ){
        super(trackingnumber, specification, mailingclass);
        this.height = height;
        this.width = width;

    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    @Override
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
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the height of the Envelope: ");
        height = Integer.parseInt(in.nextLine());
        return height;
    }

    public int getWidth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the width of the Envelope: ");
        width = Integer.parseInt(in.nextLine());
        return width;
    }



}
