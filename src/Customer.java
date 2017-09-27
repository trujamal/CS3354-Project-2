public class Customer extends User {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private int phoneNumber;      // Holds Customers Largest dimension (integer number) - in inches
    private int address;      // address (integer number) - in inches cubed


    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    /*
      Default Constructor (Initialize to "0")
    */
    public Customer(){
        super();
        phoneNumber = "";
        address = "";
    }
    /*
      Overloaded Constructor (Initialize to user specified values)
      @param trackingnumber the item's unique trackingnumber.
      @param specification the Customers Specification .
      @param mailingclass the Customers mailing class .
      @param phoneNumber the Customers mailing phoneNumber.
      @param address the Customers mailing address.
    */
    public Customer(String trackingnumber, String specification, String mailingclass,
               string phoneNumber, string address ){
        super(trackingnumber, specification, mailingclass);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    public void display() {
        // Display's universal attributes in addition to
        // Customer's specific attributes.
        super.display();
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();
        System.out.println("address " + address);
    }
    /*************************************
     * Getters
     **************************************/
    /*
        @return Returns the Customer's phoneNumber and address
    */
    public int getphoneNumber() {
        return phoneNumber;
    }

    public int getaddress(){
        return address;
    }


}
