public abstract class User {
    int ID;
    String firstName;
    String lastName;

    public User() {}

    abstract void display();

    abstract int getID();
    abstract String getFirstName();
    abstract String getLastName();
}
