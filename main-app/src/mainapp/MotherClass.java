package mainapp;

import moduleuser.UserService;
import moduleitem.ItemService;
import moduleuser.User;
import moduleitem.Items;

import java.util.Scanner;

public class MotherClass {
    public static void main(String[] args) {

        Scanner Customer = new Scanner(System.in);
        System.out.println("please Enter your name");
        String names =Customer.next();
        System.out.println("Please Enter your age");
        int age =Customer.nextInt();
          Scanner   secondcustomer= new Scanner(System.in);
        System.out.println("please Enter your name");
           String namess= secondcustomer.next();
        System.out.println("Please Enter your age");
          int  ages=secondcustomer.nextInt();
        UserService userService = new UserService();
        ItemService itemService = new ItemService();


        userService.addUser(names, age);
        userService.addUser(namess, ages);


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
