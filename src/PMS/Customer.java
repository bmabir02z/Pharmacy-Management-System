package PMS;

import java.util.ArrayList;
import java.util.List;
public class Customer {
    int id;
    String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static List<Customer> customers = new ArrayList<>();
    public static void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer added successfully.");
    }
    public static void viewCustomers() {
        for (Customer c : customers) {
            System.out.println("ID: " + c.id + ", Name: " + c.name);
        }
    }
}
