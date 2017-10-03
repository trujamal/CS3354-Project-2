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

    public Order(int customerid, int employeeid, String trackingnumber, float shippingC, String shippingD, String deliveryD) {
        customerID = customerid;
        employeeID = employeeid;
        trackingNum = trackingnumber;
        shippingCost = shippingC;
        shippingDate = shippingD;
        deliveryDate = deliveryD;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getTrackingNum() {
        return trackingNum;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void display() {
       // System.out.println(customerID + " " + employeeID + " " + trackingNum + " " + shippingCost + " " + shippingDate + " " + deliveryDate);
        System.out.printf("|  %10s     | %10s    | %10s    | %10s     | %10.2f  | %10s|\n\n",
                          customerID, trackingNum, shippingDate, deliveryDate, shippingCost, employeeID );

    }
}
