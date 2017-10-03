import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


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
        String option;

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

        System.out.println("Please select the type of User you want to update/change: ");
        System.out.println("1. Customer \n"
                         + "2. Employee");

        option = in.nextLine();
        switch(option) {
            case "1":
                String first;
                String last;
                String number;
                String addr;

                System.out.println("Please enter the new first name: ");
                first = in.nextLine();
                userList.get(index).setFirst(first);
                System.out.println("Please enter the new last name: ");
                last = in.nextLine();
                userList.get(index).setLast(last);
                System.out.println("Please enter the Customer's new phone number: ");
                number = in.nextLine();
                userList.get(index).setPhone(number);
                System.out.println("Please enter the Customer's new address: ");
                addr = in.nextLine();
                userList.get(index).setAddress(addr);

                System.out.println("Customer's information has been updated.");
                userList.get(index).display();
                break;

            case "2":
                float salary;
                int bankNum;

                System.out.println("Please enter the Employee's new first name: ");
                first = in.nextLine();
                userList.get(index).setFirst(first);
                System.out.println("Please enter the Employee's new last name: ");
                last = in.nextLine();
                userList.get(index).setLast(last);
                System.out.println("Please enter the Employee's new monthly salary (float):");
                salary = Float.parseFloat(in.nextLine());
                userList.get(index).setSalary(salary);
                System.out.println("Please enter the Employee's new bank account number: ");
                bankNum = Integer.parseInt(in.nextLine());
                userList.get(index).setBank(bankNum);

                System.out.println("Employee's information has been updated.");
                userList.get(index).display();
                break;
        }





    }

}

