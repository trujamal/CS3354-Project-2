/**
 * An Order is used to represent a completed order in the shipping store's database.
 * It is identified by its tracking number, and holds other information like customer's ID, shipping date,
 * delivery date, shipping cost and employee's ID.
 *
 * @author Jamal and Zach
 *
 */

public class Order {
    private int customerID;
    private String trackingNum;
    private String shippingDate;
    private String deliveryDate;
    private float shippingCost;
    private int employeeID;

    public Order() {
        customerID = 000000;
        employeeID = 000000;
        trackingNum = "N/A";
        shippingCost = 0;
        shippingDate = "N/A";

    }

    /**
     * Constructor with values for all attributes
     *
     * @param customerid        Customer's ID
     * @param employeeid        Employee's ID
     * @param trackingnumber    Package Tracking Number
     * @param shippingC         Shipping cost
     * @param shippingD         Shipping Date
     * @param deliveryD         Delivery Date
     */
    public Order(int customerid, int employeeid, String trackingnumber, float shippingC, String shippingD, String deliveryD) {
        customerID = customerid;
        employeeID = employeeid;
        trackingNum = trackingnumber;
        shippingCost = shippingC;
        shippingDate = shippingD;
        deliveryDate = deliveryD;
    }
    /**
     * Returns Customer's ID
     *
     * @return Customer's ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Returns Employee's ID
     *
     * @return Employee's ID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Returns Tracking Number
     *
     * @return Tracking Number
     */
    public String getTrackingNum() {
        return trackingNum;
    }

    /**
     * Returns Shipping Cost
     *
     * @return Shipping Cost
     */
    public float getShippingCost() {
        return shippingCost;
    }

    /**
     * Returns Shipping Date
     *
     * @return Shipping Date
     */
    public String getShippingDate() {
        return shippingDate;
    }

    /**
     * Returns Delivery Date
     *
     * @return Delivery Date
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Returns a string representation, used to display the record in a table.
     * It is a formatted, columned list of its attributes
     *
     * @return representation for table entry
     */
    public void display() {
        System.out.printf("|  %9s    | %10s  | %10s | %10s | %8.2f    | %10s       |\n\n",
                          customerID, trackingNum, shippingDate, deliveryDate, shippingCost, employeeID );

    }
}
