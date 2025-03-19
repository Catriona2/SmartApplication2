package mainapp;

import moduleuser.UserService;
import moduleitem.ItemService;
import moduleuser.User;
import moduleitem.Items;

import java.util.Scanner;

public class MotherClasses {
    public static void main(String[] args) {


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
