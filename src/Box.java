import java.util.Scanner;

public class Box extends PackageOrder {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private int largestDimension;      // Holds Boxes Largest dimension (integer number) - in inches
    private int volume;      // Volume (integer number) - in inches cubed


    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/

    public Box() {}

    /*
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param specification the Boxes Specification .
      @param mailingclass the Boxes mailing class .
      @param largestDimension the Boxes mailing largestDimension.
      @param volume the Boxes mailing volume.
    */
    public Box(String trackingnumber, String specification, String mailingclass, int largestDimension, int volume ){
        super(trackingnumber, specification, mailingclass);
        this.largestDimension = largestDimension;
        this.volume = volume;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    @Override
    public void display() {
        // Display's universal attributes in addition to
        // Box's specific attributes.
        super.display();
        System.out.println("largestDimension: " + largestDimension);
        System.out.println();
        System.out.println("volume " + volume);
    }
    /*************************************
     * Getters
     **************************************/
    /*
        @return Returns the Box's largestDimension and volume
    */
    public int getlargestDimension() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the largest dimension of the box: ");
        largestDimension = Integer.parseInt(in.nextLine());
        return largestDimension;
    }

    public int getvolume(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the volume of the box: ");
        volume = Integer.parseInt(in.nextLine());
        return volume;
    }


}
