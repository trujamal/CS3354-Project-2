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
        ID = 000000;
        firstName = "N/A";
        lastName = "N/A";
        phoneNumber = "N/A";
        address = "N/A";
    }
    /**
      Overloaded Constructor (Initialize to user specified values)
      @param id the Customers unique ID number.
      @param firstN the Customers first name.
      @param lastN the Customers last name.
      @param phoneNumber the Customers mailing phoneNumber.
      @param address the Customers mailing address.
    */
    public Customer(int id, String firstN, String lastN,
               String phoneNumber, String address ){
        ID = id;
        firstName = firstN;
        lastName = lastN;
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
        System.out.println("Customer" + getID() + " " + getFirstName() + " " + getLastName() + " " + getphoneNumber() + " " + getaddress());
    }
    /*************************************
     * Getters
     **************************************/
    /**
        @return Returns the Customer's phoneNumber and address
    */
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getaddress() {
        return address;
    }


}
