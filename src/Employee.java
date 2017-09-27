
import java.io.Serializable;

public class Employee extends User implements Serializable {

    // Member Variables
    private int SSN;
    private float monthlySalary;
    private int ddbank;

    public Employee(){
        super();
        SSN = 0000000;
        monthlySalary = 0;
        ddbank = 0;
    }

    public Employee(int id, String firstN, String lastN, int ssn, float salary, int bankNum) {
        super(id, firstN, lastN);
        SSN = ssn;
        monthlySalary = salary;
        ddbank = bankNum;
    }


   @Override
   public void display() {
       // Display's universal attributes in addition to
       // Customer's specific attributes.
       super.display();
       System.out.println("SSN: " + SSN);
       System.out.println();
       System.out.println("Monthly Salary: " + monthlySalary);
       System.out.println();
       System.out.println("Bank Deposit Number " + ddbank);
   }

    /*************************************
     * Getters
     **************************************/

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
