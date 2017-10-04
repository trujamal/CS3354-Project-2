import java.io.*;
import java.util.ArrayList;

public class Transaction implements Serializable {

    private ArrayList<Order> transactionList;

    
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
        OutputStream file = null;
        OutputStream buffer = null;
        ObjectOutput output = null;

        try {
            file = new FileOutputStream("Transaction.ser");
            buffer = new BufferedOutputStream(file);
            output = new ObjectOutputStream(buffer);

            output.writeObject(transactionList);

            output.close();

        } catch (Exception c) {
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
