package PMS;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
class Medicine {
    int id;
    String name;
    int quantity;
    double price;
    Medicine(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    static List<Medicine> inventory = new ArrayList<>();
    public static void addMedicine(Medicine m) {
        inventory.add(m);
        System.out.println("Medicine added successfully.");
    }
    public static void viewMedicines() {
        for (Medicine m : inventory) {
            System.out.println("Price of medicine is: 50");

        }
    }
    public static boolean checkMedicine(int id) {
        for (Medicine m : inventory) {
            if (m.id == id) return true;
        }
        return false;
    }
    public static Medicine getMedicine(int id) {
        for (Medicine m : inventory) {
            if (m.id == id) return m;
        }
        return null;
    }
}