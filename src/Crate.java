import java.util.Scanner;

public class Crate extends PackageOrder {

    private float weight;
    private String content;

    public Crate() {}

    public Crate (String trackingnumber, String specification, String mailingclass, float w, String c) {
        super(trackingnumber, specification, mailingclass);
        weight = w;
        content = c;
    }

    public float getWeight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the weight of the Crate: ");
        weight = Float.parseFloat(in.nextLine());


        return weight;
    }

    public String getContent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the contents of the Crate: ");
        content = in.nextLine();
        return content;
    }
}
