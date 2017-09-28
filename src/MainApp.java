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

        // Displays Menu Options
        MenuOptions();

        // Selection Input
        int selection = in.next().charAt(0);
        in.nextLine();

        while (selection != '9') {

            switch (selection) {
                case '1':
                    // Shows Package Orders
                    shippingstore.showPackageOrders();
                    break;
                case '2':
                    // Shows options and handles types
                    String inputType = TypeOptions();

                    // Declaring variables
                    String trackNum = "", spec = "", mail = "";

                    switch(inputType) {
                        case "1":
                            // Case 1: Envelope
                            trackNum = TrackingNumPrompt();
                            System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                            spec = in.nextLine();
                            System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                            mail = in.nextLine();
                            // Creates new envelope object
                            Envelope env;
                            int height = env.getHeight(), width = env.getWidth();
                            env = new Envelope(trackNum,spec,mail,height,width);
                            break;

                        case "2":
                            // Case 2: Box
                            trackNum = TrackingNumPrompt();
                            System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                            spec = in.nextLine();
                            System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                            mail = in.nextLine();
                            // Creates new box object
                            Box bx;
                            int dimension = bx.getlargestDimension(), volume = bx.getvolume();
                            bx = new Box(trackNum,spec,mail,dimension,volume);
                            break;

                        case "3":
                            // Case 3: Crate

                            trackNum = TrackingNumPrompt();
                            System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                            spec = in.nextLine();
                            System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                            mail = in.nextLine();
                            // Creates new crate object
                            Crate cr;
                            float weight = cr.getWeight();
                            String content = cr.getContent();
                            cr = new Crate(trackNum,spec,mail,weight,content);
                            break;

                        case "4":
                            // Case 4: Drum

                            trackNum = TrackingNumPrompt();
                            System.out.println("Please enter the Specification (Fragile, Catalogs, Books, Do-not-bend, n/a): ");
                            spec = in.nextLine();
                            System.out.println("Please enter a mailing class (First, Ground, Priority, Retail, Metro): ");
                            mail = in.nextLine();
                            // Creates new drum object
                            Drum dr;
                            String material = dr.getMaterial();
                            float diameter = dr.getDiameter();
                            dr = new Drum(trackNum,spec,mail,material,diameter);
                            break;
                    }

                    shippingstore.addOrder(trackNum,spec,mail);
                    break;
                case '3':
                    shippingstore.showPackageOrders();
                    String info = TrackingNumPrompt();
                    shippingstore.removeOrder(info);
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
                    // Code is something like this
                    // Add new user to the database
                    System.out.println("Please enter id");
                    int id =  in.nextInt();

                    System.out.println("Please enter first and last name");
                    String firstN = in.nextLine(), lastN = in.nextLine();

                    User newUser;
                    newUser = new User(id,firstN,lastN);

                    break;

                case '7':
                    // Update user info (given their id)
                    System.out.println("Please enter id");
                    int other =  in.nextInt();

                    User currentUser = null;
                    if(currentUser.getID() == other)
                        currentUser.display();
                    // Something along the lines of that
                    break;

                case '8':
                    // Complete a shipping transaction


                    break;

                case '9':
                    // Show completed shipping transactions


                    break;
                case '0':
                    System.out.println("Exiting Program, Thank You!");
                    System.exit(0);
                    break;

                case 'h':
                    MenuOptions();
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

    /**
     * MenuOptions Displays the menuoptions in the database
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

    public static String TypeOptions()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please select a package type: ");
        System.out.println("1. Envelope \n"
                + "2. Box \n"
                + "3. Crate \n"
                + "4. Drum \n");
        String inputType = in.nextLine();

        return inputType;
    }

    public static String TrackingNumPrompt()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Tracking number (5-character alphanumeric):");
        String trackingNumber = in.nextLine();
        return trackingNumber;
    }
}
