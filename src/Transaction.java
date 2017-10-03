import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Transaction {

    private ArrayList<Order> transactionList;

    public Transaction() throws IOException {
        transactionList = new ArrayList<>();
    }

    public void addTransaction(Order or) {
        transactionList.add(or);
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


}
