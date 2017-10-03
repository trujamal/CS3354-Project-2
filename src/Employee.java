
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
       System.out.printf("| %8s | %8s | %8s     | %10s     |%3s %5s  \n %62s %5.2f \n %70s %5s \n", "Employee", getID(), getFirstName()
               , getLastName(), "SSN: ", getSSN(), "  Salary: ", getSalary(), "  Bank Account #: ", getBankNumber());
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

    public void setFirst(String first) {
        firstName = first;
    }

    public void setLast(String last) {
        lastName = last;
    }

    public void setSSN(int ssn) {
        SSN = ssn;
    }

    public void setSalary(float salary) {
        monthlySalary = salary;
    }

    public void setBank(int bankNum) {
        ddbank = bankNum;
    }

    public void setPhone(String phoneNum) { }

    public void setAddress(String addr) { }

}
