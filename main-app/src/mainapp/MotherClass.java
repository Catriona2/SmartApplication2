package mainapp;

import moduleuser.UserService;
import moduleitem.ItemService;
import moduleuser.User;
import moduleitem.Items;

import java.util.Scanner;

public class MotherClass {


    static String name  = " Awor";
    static int age=23;
    public static void main(String[] args) {
        User use = new User("Awor",22);


        UserService userService = new UserService();
        ItemService itemService = new ItemService();


        userService.addUser(name, age);
        userService.addUser(name, age);


        itemService.addItem("Laptop", 150.00);
        itemService.addItem("microphone", 1000.00);


        System.out.println("Users in the System:");
        for (User user : userService.getUsers()) {
            System.out.println(user);
        }
        System.out.println("\nItems in the System:");
        for (Items item : itemService.getItems()) {
            System.out.println(item);
        }
    }
}
