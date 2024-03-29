import java.io.Serializable;

public class Customer extends User implements Serializable {
    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/

    // Define private member variables.
    private String phoneNumber;      // Holds Customers phone number
    private String address;      // Holds Customers address

    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/
    /**
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
    /**
     * Returns a string representation, used to display the record in a table.
     * It is a formatted, columned list of its attributes
     *
     * @return representation for table entry
     */
    @Override
    public void display() {
        // Display's universal attributes in addition to
        // Customer's specific attributes.
        System.out.printf("| %8s | %8s | %8s     | %10s     |%6s %5s  \n %63s %5s \n \n", "Customer", getID(), getFirstName()
                , getLastName(), "Phone Number: ", getphoneNumber(), "  Address: ", getaddress());

    }
    /*************************************
     * Getters
     **************************************/
    /**
     *  @return Returns the Customer's ID, First and Last name,
     *  PhoneNumber and Address
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


    /*************************************
     * Getters
     **************************************/
    /**
     @return Returns the Customer's Phone Number and Address, First and Last Name
     */
    public void setFirst(String first) {
        firstName = first;
    }

    public void setLast(String last) {
        lastName = last;
    }

    public void setPhone(String phoneNum) {
        phoneNumber = phoneNum;
    }

    public void setAddress(String addr) {
        address = addr;
    }

    public void setSSN(int ssn) { }

    public void setSalary(float salary) { }

    public void setBank(int bankNum) { }



}
