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

    private ArrayList<PackageOrder> packageOrderList;

    /**
     * This constructor is hard-coded to open "<CODE>PackageOrderDB.txt</CODE>" and
     * initialize the <CODE>PackageOrderList</CODE> with its contents. If no such file
     * exists, then one is created. The contents of the file are "loaded" into
     * the PackageOrderList ArrayList in no particular order. The file is then closed
     * during the duration of the program until <CODE>flush()</CODE> is called.
     * @throws IOException
     */
    public ShippingStore() throws IOException {
        packageOrderList = new ArrayList<>();
        Scanner orderScanner;

        File dataFile = new File("PackageOrderDB.txt");

        // If data file does not exist, create it.
        if (!dataFile.exists()) {
            System.out.println("PackageOrderDB.txt does not exist, creating one now . . .");
            //if the file doesn't exists, create it
            PrintWriter pw = new PrintWriter("PackageOrderDB.txt");
            //close newly created file so we can reopen it
            pw.close();
        }

        orderScanner = new Scanner(new FileReader(dataFile));

        //Initialize the Array List with package orders from PackageOrderDB.txt
        while (orderScanner.hasNextLine()) {

            // split values using the space character as separator
            String[] temp = orderScanner.nextLine().split(" ");

            packageOrderList.add(new PackageOrder(temp[0], temp[1], temp[2]));

        }

        //Package order list is now in the ArrayList completely so we can close the file
        orderScanner.close();
    }

    /**
     * Method showPackageOrder displays the current list of package orders in the Arraylist in no
     * particular order.
     *
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
    private void showPackageOrders(ArrayList<PackageOrder> orders) {

        System.out.println(" ------------------------------------------------------------------------------------- ");
        System.out.println("| Tracking # | Specification    | Mailing Class |          Other Details              |");
        System.out.println(" ------------------------------------------------------------------------------------- ");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println(String.format("| %-14s| %-14s| %-14s| %-35s|",
                    orders.get(i).getTrackingNumber(),
                    orders.get(i).getSpecification(),
                    orders.get(i).getMailingClass())) ;
        }
        System.out.println(" -------------------------------------------------------------------------------------\n");

    }


    /**
     * This method can be used to find a package order in the Arraylist of orders.
     *
     * @param trackingNumber a <CODE>String</CODE> that represents the tracking number 
     * of the order that to be searched for.
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
    
    /**
     * This method can be used to search for a package order in the Arraylist of orders.
     *
     * @param trackingNumber a <CODE>String</CODE> that represents the tracking number
     * of the order that to be searched for.
     */
    public void searchPackageOrder(String trackingNumber) {

        int index = findPackageOrder(trackingNumber);

        if (index != -1) {
            ArrayList<PackageOrder> order = new ArrayList<>(1);
            order.add(getPackageOrder(index));
            System.out.println("\nHere is the order that matched:\n");
            showPackageOrders(order);
        } else {
            System.out.println("\nSearch did not find a match.\n");
        }
    }
    

    public void addOrder(String trackingnumber, String specification, String mailingclass) {

        if (this.findPackageOrder(trackingnumber) != -1) {
            System.out.println("Package Order already exists in database. \n");
            return;
        }

        if (!trackingnumber.matches("[A-Za-z0-9]{5}")) {
            System.out.println("Invalid Tracking Number: not proper format."
                + "Tracking Number must be at least 5 alphanumeric characters.");
            return;
        }

        if (!(specification.equals("Fragile") || specification.equals("Books") || specification.equals("Catalogs")
            || specification.equals("Do-not-Bend") || specification.toUpperCase().equals("N/A"))) {
            System.out.println("Invalid specification:\n"
                + "Specification must be one of following: "
                + "Fragile, Books, Catalogs, Do-not-Bend, N/A.");
            return;
        }

        if (!(mailingclass.equals("First") || mailingclass.equals("Priority") || mailingclass.equals("Retail")
            || mailingclass.equals("Ground") || mailingclass.equals("Metro")) ) {
            System.out.println("Invalid Mailing Class:\n"
                + "Mailing Class must be one of following: "
                + "First, Priority, Retail, Ground, Metro.");
            return;
        }

        //If passed all the checks, add the order to the list
        packageOrderList.add(new PackageOrder(trackingnumber, specification, mailingclass));
        System.out.println("Package Order has been added.\n");
    }


    public void removeOrder(String trackingNum) {
        int orderID = findPackageOrder(trackingNum);
        if (orderID == -1) {
            System.out.println("\nAction failed. No package order with the given tracking # exist in database.\n");
        }
        else {
            packageOrderList.remove(orderID);
            System.out.println("\nAction successful. Package order has been removed from the database.\n");
        }
    }

    /**
     * This method is used to retrieve the PackageOrder object from the
     * <CODE>PackageOrderList</CODE> at a given index.
     *
     * @param i the index of the desired <CODE>PackageOrder</CODE> object.
     * @return the <CODE>PackageOrder</CODE> object at the index or null if the index is
     * invalid.
     */
    public PackageOrder getPackageOrder(int i) {
        if (i < packageOrderList.size() && i >= 0) {
            return packageOrderList.get(i);
        } else {
            System.out.println("Invalid Index. Please enter another command or 'h' to list the commands.");
            return null;
        }
    }

    /**
     * This method opens <CODE>"PackageOrderDB.txt"</CODE> and overwrites it with a text representation of
     * all the package orders in the <CODE>PackageOrderList</CODE>.
     * This should be the last method to be called before exiting the program.
     * @throws IOException
     */
    public void flush() throws IOException {
        PrintWriter pw = new PrintWriter("PackageOrderDB.txt");

        for (PackageOrder c : packageOrderList) {
            pw.print(c.toString());
        }

        pw.close();
    }

}
