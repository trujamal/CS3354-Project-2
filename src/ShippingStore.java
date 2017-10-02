import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is used to represent a database interface for a list of
 * <CODE>Package Order</CODE>'s. It using a plain-text file "PackageOrderDB.txt"
 * to store and write package order objects in readable text form. It contains
 * an <CODE>ArrayList</CODE> called <CODE>PackageOrderList</CODE> to store the
 * database in a runtime friendly data structure. The <CODE>PackageOrderList</CODE>
 * is written to "PackageOrderDB.txt" at the end of the <CODE>ShippingStore</CODE> object's
 * life by calling <CODE>flush()</CODE>. This class also provides methods for
 * adding, remove, and searching for shipping orders from the list.
 *
 */
public class ShippingStore {

    private ArrayList<Package> packageOrderList;


    /**
     * This constructor is hard-coded to open "<CODE>PackageOrderDB.txt</CODE>" and
     * initialize the <CODE>PackageOrderList</CODE> with its contents. If no such file
     * exists, then one is created. The contents of the file are "loaded" into
     * the PackageOrderList ArrayList in no particular order. The file is then closed
     * during the duration of the program until <CODE>flush()</CODE> is called.
     *
     * @throws IOException
     */
    public ShippingStore() throws IOException {
        packageOrderList = new ArrayList<>();
    }

    /**
     * Method showPackageOrder displays the current list of package orders in the Arraylist in no
     * particular order.
     */
    public void showPackageOrders() {
        showPackageOrders(packageOrderList);
    }

    /**
     * Private method used as an auxiliary method to display a given ArrayList
     * of package orders in a formatted manner.
     *
     * @param orders the package order list to be displayed.
     */
    private void showPackageOrders(ArrayList<Package> orders) {
        for(int i = 0; i < orders.size(); i++) {
            orders.get(i).display();
        }
    }


    /**
     * This method can be used to find a package order in the Arraylist of orders.
     *
     * @param trackingNumber a <CODE>String</CODE> that represents the tracking number
     *                       of the order that to be searched for.
     * @return the <CODE>int</CODE> index of the package orders in the Arraylist of orders,
     * or -1 if the search failed.
     */
    public int findPackageOrder(String trackingNumber) {

        int index = -1;

        for (int i = 0; i < packageOrderList.size(); i++) {
            String temp = packageOrderList.get(i).getTrackingNumber();

            if (trackingNumber.equalsIgnoreCase(temp)) {
                index = i;
                break;
            }

        }

        return index;
    }


    public void addOrder(Package p) {
        packageOrderList.add(p);
        System.out.println("Package Order has been added.\n");
    }

    /**
     * This method can be used to remove a package order in the Arraylist of orders.
     *
     * @param trackingNum a <CODE>String</CODE> that represents the tracking number
     *                    of the order that to be removed.
     */
    public void removeOrder(String trackingNum) {
        int orderID = findPackageOrder(trackingNum);
        if (orderID == -1) {
            System.out.println("\nAction failed. No package order with the given tracking # exist in database.\n");
        } else {
            packageOrderList.remove(orderID);
            System.out.println("\nAction successful. Package order has been removed from the database.\n");
        }
    }


    }
}




