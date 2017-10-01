
import java.io.Serializable;

public class Employee extends User implements Serializable {

    /***************************************************************************
     * VARIABLE DEFINITIONS
     **************************************************************************/
    private int SSN;
    private float monthlySalary;
    private int ddbank;

    /***************************************************************************
     * CONSTRUCTORS
     **************************************************************************/

    public Employee(){
        super();
        SSN = 0000000;
        monthlySalary = 0;
        ddbank = 0;
    }

    public Employee(int id, String firstN, String lastN, int ssn, float salary, int bankNum) {
        ID = id;
        firstName = firstN;
        lastName = lastN;
        SSN = ssn;
        monthlySalary = salary;
        ddbank = bankNum;
    }
    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/

   @Override
   public void display() {
       // Display's universal attributes in addition to
       // Customer's specific attributes.
       System.out.println("Employee" + getID() + " " + getFirstName() + " " + getLastName() + " " + getSSN() + " " + getSalary() + " " + getBankNumber());
   }

    /*************************************
     * Getters
     **************************************/
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public float getSalary() {
        return monthlySalary;
    }

    public int getBankNumber() {
        return ddbank;
    }

}
