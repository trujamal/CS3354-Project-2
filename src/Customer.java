public class Customer extends User {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private String phoneNumber;      // Holds Customers phone number
    private String address;      // Holds Customers address


    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    /*
      Default Constructor (Initialize to "0")
    */
    public Customer(){
        super();
        phoneNumber = " ";
        address = " ";
    }
    /*
      Overloaded Constructor (Initialize to user specified values)
      @param ID the Customers unique ID number.
      @param firstName the Customers first name.
      @param lastName the Customers last name.
      @param phoneNumber the Customers mailing phoneNumber.
      @param address the Customers mailing address.
    */
    public Customer(int ID, String firstName, String lastName,
               String phoneNumber, String address ){
        super(ID, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    @Override
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
    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getaddress(){
        return address;
    }


}
