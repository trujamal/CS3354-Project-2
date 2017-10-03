import java.io.*;
import java.util.ArrayList;

public class Transaction {

    private ArrayList<Order> transactionList;

    
    private int customerID;
    private String trackingNumber;
    private int shippingDate;
    private int deliveryDate;
    private float shippingCost;
    private int employeeID;

    public Transaction() throws IOException {
        transactionList = new ArrayList<Order>();
    }

    public Transaction(int customerid, String trackingnumber, int shippingdate, int deliverydate, float shippingcost, int employeeid){
        customerID = customerid;
        trackingNumber = trackingnumber;
        shippingDate = shippingdate;
        deliveryDate = deliverydate;
        shippingCost = shippingcost;
        employeeID = employeeid;
    }

    public void addTransaction(Order p) {
        transactionList.add(p);
        System.out.println("Transaction Order has been added.\n");
    }

    public void showTransactions() {
        showTransactionOrders(transactionList);
    }

    private void showTransactionOrders(ArrayList<Order> orders) {
        for(int i = 0; i < orders.size(); i++) {
            orders.get(i).display();
        }
    }
    @SuppressWarnings("Duplicates")
    public void saveInfo()
    {
        try {
            transactionList.get(0).display();
            OutputStream f = new FileOutputStream("Users.ser");
            OutputStream b = new BufferedOutputStream(f);
            ObjectOutput output = new ObjectOutputStream(b);
            output.writeObject(transactionList);

        } catch (Exception c){
            System.out.println(c);
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
