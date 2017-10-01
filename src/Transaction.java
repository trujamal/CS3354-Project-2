import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Transaction {
    
    private int customerID;
    private String trackingNumber;
    private Date shippingDate;
    private Date deliveryDate;
    private float shippingCost;
    private int employeeID;

    public Transaction(int customerID, String trackingNumber, Date shippingDate, Date deliveryDate, float shippingCost, int employeeID){
        this.customerID = customerID;
        this.trackingNumber = trackingNumber;
        this.shippingDate = shippingDate;
        this.deliveryDate = deliveryDate;
        this.shippingCost = shippingCost;
        this.employeeID = employeeID;
    }

    /*************************************
     * Getters
     **************************************/
    public int getcustomerID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter customer ID number: ");
        customerID = in.nextLine();
        return customerID;
    }

    public String getTrackingNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Tracking Number: ");
        trackingNumber = in.nextLine();
        return trackingNumber;
    }

    public Date getshippingDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter shipping date: ");
        shippingDate = in.nextLine();
        return shippingDate;
    }

    public Date getdeliveryDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter delivery date: ");
        deliveryDate = in.nextLine();
        return deliveryDate;
    }

    public float getshippingCost(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter shipping cost: ");
        shippingCost = in.nextLine();
        return shippingCost;
    }

    public int getemployeeID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter employee ID: ");
        employeeID = in.nextLine();
        return employeeID;
    }


    public Transaction() throws IOException {
    }
}
