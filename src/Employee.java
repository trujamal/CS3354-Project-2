
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

   //todo  @Override display

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
