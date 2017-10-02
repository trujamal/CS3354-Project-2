import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

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

        ShippingStore shippingstore = new ShippingStore();
<<<<<<<<< Temporary merge branch 1
        UserManager usermanager = new UserManager();
=========
        Transaction transaction = new Transaction();
>>>>>>>>> Temporary merge branch 2

        // Displays Menu Options
        MenuOptions();

        // Selection

        String selection;
        selection = in.nextLine();

        while (selection != "10") {

            switch (selection) {
                case "1":
                    shippingstore.showPackageOrders();
                    break;
                case "2":
                    String inputType;
                    String trackNum;
                    String spec;
                    String mail;

                    System.out.println("Please select a package type: ");
                    System.out.println("1. Envelope \n"
                            + "2. Box \n"
                            + "3. Crate \n"
                            + "4. Drum \n");
                    inputType = in.nextLine();

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

                    break;
                case "3":
                    shippingstore.showPackageOrders();

                    System.out.println("\nPlease enter the tracking # of the package order to delete from the database.\n");
                    String orderToDelete = in.nextLine();
                    shippingstore.removeOrder(orderToDelete);
                    break;
                case "4":
                    System.out.println("\nEnter the Tracking # of the order you wish to see.\n");
                    String trackingNum = in.next();
                    in.nextLine();

                    int index = shippingstore.findPackageOrder(trackingNum);
                    if(index >= 0)
                        System.out.println("Package was found.");
                    else
                        System.out.println("Package was not found.");

                    break;
                case "5":
                    // Show a list of users in the database
                    usermanager.showUsers();

                    break;
                case "6":
                    // Add new user to the database
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

                            System.out.println("Please enter the Customer's ID: ");
                            id = Integer.parseInt(in.nextLine());
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

                            System.out.println("Please enter the Employee's ID: ");
                            id = Integer.parseInt(in.nextLine());
                            System.out.println("Please enter the Employee's first name: ");
                            first = in.nextLine();
                            System.out.println("Please enter the Employee's last name: ");
                            last = in.nextLine();
                            System.out.println("Please enter the Employee's SSN: ");
                            SSN = Integer.parseInt(in.nextLine());
                            System.out.println("Please enter the Employee's monthly salary: ");
                            monthS = Float.parseFloat(in.nextLine());
                            System.out.println("Please enter the Employee's bank account number: ");
                            directDeposit = Integer.parseInt(in.nextLine());

                            Employee e = new Employee(id, first, last, SSN, monthS, directDeposit);
                            usermanager.addUser(e);
                            break;
                    }


                    break;

                case "7":
                    // Update user info (given their id)



                    break;

                case "8":
                    // Complete a shipping transaction
                    int inputNum;
                    System.out.println("Select transaction type: ");
                    System.out.println("1. Shipping \n"
                            + "2. Deliver \n");
                    inputNum = in.nextInt();

                    while (inputNum == '1' || inputNum == '2') {

                        switch (inputNum) {
                            case '1':
                                int customerID;
                                String trackingNumber;
                                int shippingDate;
                                int deliveryDate;
                                float shippingCost;
                                int employeeID;

                                System.out.println("Please enter customer ID number: ");
                                customerID = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter Tracking Number: ");
                                trackingNumber = in.nextLine();
                                System.out.println("Please enter shipping date: ");
                                shippingDate = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter delivery date: ");
                                deliveryDate = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter shipping cost: ");
                                shippingCost = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter employee ID: ");
                                employeeID = Integer.parseInt(in.nextLine());

                               //Transaction t = new Transaction(customerID, trackingNumber, shippingDate, deliveryDate, shippingCost, employeeID);
                               //transaction.addTransaction(t);

                                break;

                            case '2':
                                System.out.println("Please enter customer ID number: ");
                                customerID = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter Tracking Number: ");
                                trackingNumber = in.nextLine();
                                System.out.println("Please enter shipping date: ");
                                shippingDate = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter delivery date: ");
                                deliveryDate = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter shipping cost: ");
                                shippingCost = Integer.parseInt(in.nextLine());
                                System.out.println("Please enter employee ID: ");
                                employeeID = Integer.parseInt(in.nextLine());

                                //Transaction t = new Transaction(customerID, trackingNumber, shippingDate, deliveryDate, shippingCost, employeeID);
                                //transaction.addTransaction(t);

                                break;
                        }
                    }


                    break;

                case "9":
                    // Show completed shipping transactions
                    transaction.showTransactions();


                    break;
                case "10":
                    System.out.println("Exiting Program, Thank You!");
                    System.exit(0);
                    break;

                case "h":
                    MenuOptions();
                    break;
                default:
                    System.out.println("That is not a recognized command. Please enter another command or 'h' to list the commands.");
                    break;

            }

            System.out.println("Please enter another command or 'h' to list the commands.\n");
            selection = in.nextLine();
        }
        
        System.out.println("Done!");

    }

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
}
