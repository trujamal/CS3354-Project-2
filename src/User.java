/**
 * The abstract class User represents the details that each user holds.
 * The class sets user's first and last name and ID. User's information varies
 * if the user is an Employee or a Customer. The abstract class User sets the phone
 * number and address for Customer and SSN, Salary, and Direct Deposit Bank Account Number.
 *
 * @author Jamal and Zach
 *
 */
public abstract class User {
    int ID;
    String firstName;
    String lastName;
    /** Constructor */
    public User() {}

    abstract void display();

    abstract int getID();
    abstract String getFirstName();
    abstract String getLastName();

    abstract void setFirst(String first);
    abstract void setLast(String last);

    abstract void setPhone(String phoneNum);
    abstract void setAddress(String addr);

    abstract void setSSN(int ssn);
    abstract void setSalary(float salary);
    abstract void setBank(int bankNum);

}
