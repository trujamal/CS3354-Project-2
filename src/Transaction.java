import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Transaction {
    
    private int customerID;
    private String trackingNumber;
    private int shippingDate;
    private int deliveryDate;
    private float shippingCost;
    private int employeeID;

    public Transaction(int customerID, String trackingNumber, int shippingDate, int deliveryDate, float shippingCost, int employeeID){
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
        customerID = Integer.parseInt(in.nextLine());
        return customerID;
    }

    public String getTrackingNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Tracking Number: ");
        trackingNumber = in.nextLine();
        return trackingNumber;
    }

    public int getshippingDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter shipping date: ");
        shippingDate = Integer.parseInt(in.nextLine());
        return shippingDate;
    }

    public int getdeliveryDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter delivery date: ");
        deliveryDate = Integer.parseInt(in.nextLine());
        return deliveryDate;
    }

    public float getshippingCost(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter shipping cost: ");
        shippingCost = Float.parseFloat(in.nextLine());
        return shippingCost;
    }

    public int getemployeeID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter employee ID: ");
        employeeID = Integer.parseInt(in.nextLine());
        return employeeID;
    }


    public Transaction() throws IOException {
    }
}
