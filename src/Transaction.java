import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Transaction {

    private ArrayList<Package> transactionList;

    
    private int customerID;
    private String trackingNumber;
    private int shippingDate;
    private int deliveryDate;
    private float shippingCost;
    private int employeeID;

    public Transaction() throws IOException {
        transactionList = new ArrayList<>();
    }

    public Transaction(int customerid, String trackingnumber, int shippingdate, int deliverydate, float shippingcost, int employeeid){
        customerID = customerid;
        trackingNumber = trackingnumber;
        shippingDate = shippingdate;
        deliveryDate = deliverydate;
        shippingCost = shippingcost;
        employeeID = employeeid;
    }

    public void addTransaction(Package t) {
        transactionList.add(t);
        System.out.println("Transaction Order has been added.\n");
    }

    public void showTransactions() {
        showTransactionOrders(transactionList);
    }

    private void showTransactionOrders(ArrayList<Package> orders) {
        for(int i = 0; i < orders.size(); i++) {
            orders.get(i).display();
        }
    }


        /*************************************
         * Getters
         **************************************/
    public int getcustomerID(){
        return customerID;
    }

    public String getTrackingNumber(){
        return trackingNumber;
    }

    public int getshippingDate(){
        return shippingDate;
    }

    public int getdeliveryDate(){
        return deliveryDate;
    }

    public float getshippingCost(){
        return shippingCost;
    }

    public int getemployeeID(){
        return employeeID;
    }

}
