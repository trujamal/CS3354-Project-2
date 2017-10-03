public abstract class User {
    int ID;
    String firstName;
    String lastName;

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
