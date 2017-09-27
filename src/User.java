public class User {
    private int ID;
    private String firstName;
    private String lastName;

    public User() {
        ID = 00000;
        firstName = "N/A";
        lastName = "N/A";
    }

    public User(int id, String firstN, String lastN) {
        ID = id;
        firstN = firstName;
        lastN = lastName;
    }
    public void display() {
        System.out.println(ID + " " + firstName + " " + lastName);
    }

    public int getID() {return ID;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
}
