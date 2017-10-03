import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
import java.util.logging.*;

public class UserManager {

    private ArrayList<User> userList;

    public UserManager() throws IOException {
        userList = new ArrayList<>();
    }

    public void showUsers() { showUsers(userList); }

    private void showUsers(ArrayList<User> users) {
        for(int i = 0; i < users.size(); i++) {
            users.get(i).display();
        }
    }

    public int idGen() {
        Random r = new Random(System.currentTimeMillis());
        return((1+r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public int findUser(int ID) {
        int index = -1;

        for (int i = 0; i < userList.size(); i++) {
            int temp = userList.get(i).getID();

            if (ID == temp) {
                index = i;
                break;
            }

        }

        return index;
    }

    public void addUser(User u) {
        userList.add(u);
        System.out.println("User has been added.\n");
    }

    public void updateUser() {
        int searchID;
        int index;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the user's ID that you wish to update/change: ");
        searchID = Integer.parseInt(in.nextLine());
        index = findUser(searchID);
        if(index >= 0) {
            System.out.println("User was found.");
            userList.get(index).display();
        }
        else
            System.out.println("User was not found.");
        System.out.println("What do you want to change?");
    }

    public void saveInfo(ArrayList<User> users)
    {
        try (OutputStream file = new FileOutputStream("Users.ser")) {
            try (OutputStream buffer = new BufferedOutputStream(file)) {
                try (ObjectOutput output = new ObjectOutputStream(buffer)) {
                    output.writeObject(users);
                }
            }
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
        }

    }

    private static final Logger fLogger =
            Logger.getLogger(UserManager.class.getPackage().getName());
}

