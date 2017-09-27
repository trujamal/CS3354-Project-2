
import java.io.Serializable;

public class Employee extends User implements Serializable {

    // Member Variables
    private int ssn;
    private float monthlySalary;
    private int ddban;

    public Employee(){
        super();
        ssn = 0;
        monthlySalary = 0;
        ddban = 0;
    }

    public Employee(String trackingnumber, String specification, String mailingclass,
                    int height, int width ){
        super(trackingnumber, specification, mailingclass);
        this.height = height;
        this.width = width;
    }

    /***************************************************************************
     * PUBLIC MEMBER METHODS
     **************************************************************************/
    public void display() {
        // Display's universal attributes in addition to
        // Envelope's specific attributes.
        super.display();
        System.out.println("Height: " + height);
        System.out.println();
        System.out.println("Width " + width);
    }
    /*************************************
     * Getters
     **************************************/
    /*
        @return Returns the Envelope's Height and Width
    */
    public int getHeight() {
        return height;
    }

    public int getWidth(){
        return width;
    }



>>>>>>> Stashed changes
}
