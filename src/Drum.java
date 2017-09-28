import java.util.Scanner;

public class Drum extends PackageOrder {
    private String material;
    private float diameter;

    public Drum() {
        super();
        material = "N/A";
        diameter = 0;
    }

    public Drum(String trackingnumber, String specification, String mailingclass, String m, float d) {
        super(trackingnumber, specification, mailingclass);
        material = m;
        diameter = d;
    }

    public String getMaterial() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the material of the Drum: ");
        material = in.nextLine();

        return material;
    }

    public float getDiameter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the diameter of the Drum: ");
        diameter = Float.parseFloat(in.nextLine());
        return diameter;
    }
}
