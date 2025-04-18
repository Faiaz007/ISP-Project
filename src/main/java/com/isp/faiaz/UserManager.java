package com.isp.faiaz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static List<User> userList = new ArrayList<>();
    private static final String filename ="user.bin";

    static {
        userList.add(new User("Customer", "Faiaz", "888",26));
        userList.add(new User("Billing Manager", "Asif","555",20));
        userList.add(new User("Admin", "Dipto", "444",18 ));
        userList.add(new User("Manager", "Musfiq", "333",22));


        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));) {
            UserManager.userList = (List<User>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
