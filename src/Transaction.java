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

        try {
            FileInputStream fileIn = new FileInputStream("transactions.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            transactionList = (ArrayList<Order>) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i) {
            System.out.println("transactions.ser file not found");
        }
        catch(ClassNotFoundException c) {
            System.out.println("Transaction class not found");
        }
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
            FileOutputStream fileOut = new FileOutputStream("transactions.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(transactionList);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved as transactions.ser\n");
        }
        catch(IOException i) {
            i.printStackTrace();
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
