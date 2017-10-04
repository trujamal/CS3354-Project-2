import java.util.*;

/**
 * This is the main class of the ShippingStore database manager. It provides a
 * console for a user to use the 9 main commands.
 *
 * @author Jamal Rasool and Zach Sotak
 */
public class MainApp {

    /**
     * This method will begin the user interface console. Main uses a loop to
     * continue doing commands until the user types '6'. A lot of user input
     * validation is done in the loop. At least enough to allow the interface
     * with ShippingStore to be safe.
     *
     * @param args this program expects no command line arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Array list
        ShippingStore shippingstore = new ShippingStore();
        UserManager usermanager = new UserManager();
        Transaction transaction = new Transaction();

        String choice;
        boolean exitProgram = false;
        do {
            MenuOptions();
            choice = in.nextLine();
            try {
                switch (choice) {
                    case "1":
                        showAll(shippingstore);break;
                    case "2":
                        addNewPac(shippingstore);break;
                    case "3":
                        deletePac(shippingstore);break;
                    case "4":
                        searchPac(shippingstore);break;
                    case "5":
                        showList(usermanager);break;
                    case "6":
                        addNewUser(usermanager);break;
                    case "7":
                        usermanager.updateUser();break;
                    case "8":
                        completeShip(transaction, shippingstore);break;
                    case "9":
                        showCompleted(transaction); break;
                    case "10":
                        exitProgram = true;
                        break;
                    default: System.err.println("Please select a number between 1 and 10.");
                }
            } catch (InputMismatchException ex) {
                System.err.println("Input mismatch. Please Try again.");
                in.nextLine();
                continue;
            }
        } while(!exitProgram);

        usermanager.saveInfo();
        transaction.saveInfo();
        shippingstore.saveInfo();

        System.out.println("Exiting Program, Thank You!");
        System.out.println("Done!");
    }

    /**
     * MenuOptions is designed to display all of the different options the user has to pick from in order to start the
     * main portion of the program.
     */

    public static void MenuOptions()
    {
        String welcomeMessage = "\nWelcome to the Shipping Store database. Choose one of the following functions:\n\n"
                + "\t1. Show all existing package orders in the database (Sorted by tracking number)\n"
                + "\t2. Add a new package order to the database.\n"
                + "\t3. Delete a package order from a database.\n"
                + "\t4. Search for a package order (given its Tracking #).\n"
                + "\t5. Show a list of users in the database.\n"
                + "\t6. Add new user to the database.\n"
                + "\t7. Update user info (given their id).\n"
                + "\t8. Complete a shipping transaction.\n"
                + "\t9. Show completed shipping transaction.\n"
                + "\t10. Exit program.\n";
        System.out.println(welcomeMessage);
    }

    /**
     * PrintTable is designed to just print the header portion of the table with the right output information.
     */

    public static void PrintTable() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.format("| %10s | %8s | %13s | %8s | %12s         |\n",
                 "TYPE", "TRACKING #", "SPECIFICATION", "CLASS", "OTHER DETAILS");
        System.out.println("----------------------------------------------------------------------------------");
    }

    /**
     * PrintUserTable is designed to print the users header portion of the project.
     */

    public static void PrintUserTable() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.format("| %6s   | %8s |   %10s | %10s     | %16s          |\n",
                "USER", "ID", "FIRST NAME", "LAST NAME", "OTHER DETAILS");
        System.out.println("----------------------------------------------------------------------------------");

    }

    /**
     *  Print Transaction Table is designed to just print the header portion of the transaction table
     */

    public static void PrintTransactionTable() {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.format("| %8s   | %8s  |  %8s  |  %8s  |  %8s   |   %8s   |\n",
                "CUSTOMER ID", "TRACKING #", "SHIPPING", "DELIVERY", "PRICE", "EMPLOYEE ID");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    /**]
     * Show All displays all of the information in the shipping store class
     * @param shippingstore contains the array information for the shipping store class; including all of the packages
     *                      that would be included
     */

    public static void showAll(ShippingStore shippingstore) {
            PrintTable();
            shippingstore.showPackageOrders();
            shippingstore.saveInfo();
    }

    /**
     * addNewPac is designed to add a new package to the shippingstore array
     * @param shippingstore shippoing sto re
     * @throws BadInputException
     */
    public static void addNewPac(ShippingStore shippingstore) throws BadInputException {
        Scanner in = new Scanner(System.in);
        String inputType;
        String trackNum;
        String spec;
        String mail;
        String [] optionsArray = {"1","2","3","4"};

        System.out.println("Please select a package type: ");
        System.out.println("1. Envelope \n"
                + "2. Box \n"
                + "3. Crate \n"
                + "4. Drum \n");

        inputType = in.nextLine();

        if(!Arrays.asList(optionsArray).contains(inputType)){
            throw new BadInputException("Wrong number selected you fuck");
        }

        switch(inputType) {
            case "1":
                int height;
                int width;
                System.out.println("Please enter the Tracking number: ");
                trackNum = in.nextLine();
                System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                spec = in.nextLine();
                System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                mail = in.nextLine();
                System.out.println("Please enter the height of the Envelope: ");
                height = Integer.parseInt(in.nextLine());
                System.out.println("Please enter the width of the Envelope: ");
                width = Integer.parseInt(in.nextLine());

                Envelope e = new Envelope(trackNum, spec, mail, height, width);
                shippingstore.addOrder(e);
                break;

            case "2":
                int dimension;
                int volume;
                System.out.println("Please enter the Tracking number: ");
                trackNum = in.nextLine();
                System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                spec = in.nextLine();
                System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                mail = in.nextLine();
                System.out.println("Please enter the largest dimension of the box: ");
                dimension = Integer.parseInt(in.nextLine());
                System.out.println("Please enter the volume of the box: ");
                volume = Integer.parseInt(in.nextLine());

                Box b = new Box(trackNum, spec, mail, dimension, volume);
                shippingstore.addOrder(b);
                break;

            case "3":
                float weight;
                String content;
                System.out.println("Please enter the Tracking number: ");
                trackNum = in.nextLine();
                System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                spec = in.nextLine();
                System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                mail = in.nextLine();
                System.out.println("Please enter the weight of the Crate: ");
                weight = Float.parseFloat(in.nextLine());
                System.out.println("Please enter the contents of the Crate: ");
                content = in.nextLine();

                Crate c = new Crate(trackNum, spec, mail, weight, content);
                shippingstore.addOrder(c);
                break;

            case "4":
                String material;
                float diameter;
                System.out.println("Please enter the Tracking number: ");
                trackNum = in.nextLine();
                System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                spec = in.nextLine();
                System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                mail = in.nextLine();
                System.out.println("Please enter the material of the Drum: ");
                material = in.nextLine();
                System.out.println("Please enter the diameter of the Drum: ");
                diameter = Float.parseFloat(in.nextLine());

                Drum d = new Drum(trackNum, spec, mail, material, diameter);
                shippingstore.addOrder(d);
                break;
        }
    }

    public static void deletePac(ShippingStore shippingstore) {
        Scanner in = new Scanner(System.in);
        shippingstore.showPackageOrders();

        System.out.println("\nPlease enter the tracking # of the package order to delete from the database.\n");
        String orderToDelete = in.nextLine();
        shippingstore.removeOrder(orderToDelete);
    }

    /**
     * searchPac is designed to search for a 
     * @param shippingstore
     */

    public static void searchPac(ShippingStore shippingstore) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the Tracking # of the order you wish to see.\n");
        String trackingNum = in.next();
        in.nextLine();

        int index = shippingstore.findPackageOrder(trackingNum);
        if(index >= 0)
            System.out.println("Package was found.");
        else
            System.out.println("Package was not found.");
    }

    /**
     * Showlist is designed to show the list of users in the database
     * @param usermanager object of users
     */

    public static void showList(UserManager usermanager) {
        PrintUserTable();
        usermanager.showUsers();
    }

    /**
     * addNewUser is designed to add a new user to the database
     * @param usermanager the array of users
     */
    public static void addNewUser(UserManager usermanager) {
        Scanner in = new Scanner(System.in);
        String choice;
        int id;
        String first;
        String last;

        System.out.println("Please select a User type: ");
        System.out.println("1. Customer \n"
                + "2. Employee");
        choice = in.nextLine();

        switch(choice) {
            case "1":
                String number;
                String address;

                id = usermanager.idGen();
                System.out.println("Please enter the Customer's first name: ");
                first = in.nextLine();
                System.out.println("Please enter the Customer's last name: ");
                last = in.nextLine();
                System.out.println("Please enter the Customer's phone number: ");
                number = in.nextLine();
                System.out.println("Please enter the Customer's address: ");
                address = in.nextLine();

                Customer c = new Customer(id, first, last, number, address);
                usermanager.addUser(c);
                break;

            case "2":
                int SSN;
                float monthS;
                int directDeposit;

                id = usermanager.idGen();
                System.out.println("Please enter the Employee's first name: ");
                first = in.nextLine();
                System.out.println("Please enter the Employee's last name: ");
                last = in.nextLine();
                System.out.println("Please enter the Employee's SSN: ");
                SSN = Integer.parseInt(in.nextLine());
                System.out.println("Please enter the Employee's monthly salary(float): ");
                monthS = Float.parseFloat(in.nextLine());
                System.out.println("Please enter the Employee's bank account number: ");
                directDeposit = Integer.parseInt(in.nextLine());

                Employee e = new Employee(id, first, last, SSN, monthS, directDeposit);
                usermanager.addUser(e);
                break;
        }

    }

    /**
     * Desinged to go through and process the users request to complete a shipping transaction
     * @param transaction importing the transaction array
     * @param shippingstore importing the shippingstore array of objects
     */

    public static void completeShip(Transaction transaction, ShippingStore shippingstore) {
        Scanner in = new Scanner(System.in);
        int cID;
        int eID;
        String tracking;
        float cost;
        String shippingDate;
        String deliveryDate;

        System.out.println("Please enter the Customer's ID number: ");
        cID = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the Employee's ID number: ");
        eID = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the package tracking number: ");
        tracking = in.nextLine();
        System.out.println("Please enter the price of shipping the package: ");
        cost = Float.parseFloat(in.nextLine());
        System.out.println("Please enter the date the package will be shipped: ");
        shippingDate = in.nextLine();
        System.out.println("Please enter the date the package will be delivered: ");
        deliveryDate = in.nextLine();

        Order o = new Order(cID, eID, tracking, cost, shippingDate, deliveryDate);
        transaction.addTransaction(o);
        shippingstore.removeOrder(tracking);
    }

    /**
     * Function is designed to show the completed transactions in the program
     * @param transaction is designed for importing the array of the transactions
     */

    public static void showCompleted(Transaction transaction) {
        PrintTransactionTable();
        transaction.showTransactions();
    }

}
