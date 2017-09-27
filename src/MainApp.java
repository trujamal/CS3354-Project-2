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

        int selection = in.next().charAt(0);
        in.nextLine();

        while (selection != '9') {

            switch (selection) {
                case '1':
                    shippingstore.showPackageOrders();
                    break;
                case '2':
                    String inputType;

                    System.out.println("Please select a package type: ");
                    System.out.println("1. Envelope \n"
                            + "2. Box \n"
                            + "3. Crate \n"
                            + "4. Drum \n");
                    inputType = in.nextLine();

                    switch(inputType) {
                        case "1":
                            System.out.println("Please enter the Tracking number: ");

                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            break;
                    }

                    shippingstore.addOrder();
                    break;
                case '3':
                    shippingstore.showPackageOrders();

                    System.out.println("\nPlease enter the tracking # of the package order to delete from the database.\n");
                    String orderToDelete = in.nextLine();
                    shippingstore.removeOrder(orderToDelete);
                    break;
                case '4':
                    System.out.println("\nEnter the Tracking # of the order you wish to see.\n");
                    String trackingNum = in.next();
                    in.nextLine();
                    shippingstore.searchPackageOrder(trackingNum);
                    break;
                case '5':
                    // Show a list of users in the database


                    break;
                case '6':
                    // Show a list of users in the database



                    break;

                case '7':
                    // Update user info



                    break;

                case '8':
                    // Complete a shipping



                    break;

                case '9':
                    // Show completed shipping transaction


                    break;

                case 'h':
                    System.out.println(welcomeMessage);
                    break;
                default:
                    System.out.println("That is not a recognized command. Please enter another command or 'h' to list the commands.");
                    break;

            }

            System.out.println("Please enter another command or 'h' to list the commands.\n");
            selection = in.next().charAt(0);

            in.nextLine();
        }

        in.close();
        shippingstore.flush();
        
        System.out.println("Done!");

    }
}
