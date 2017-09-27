public class Crate extends Package {

    private float weight;
    private String content;

    public Crate() {
        super();
        weight = 0;
        content = "N/A";
    }

    public Crate (String trackingnumber, String specification, String mailingclass, float w, String c) {
        super(trackingnumber, specification, mailingclass);
        weight = w;
        content = c;
    }

    public float getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }
}
