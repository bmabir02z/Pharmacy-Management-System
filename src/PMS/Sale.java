package PMS;

import java.util.List;
import java.util.ArrayList;
class Sale {
    int saleId;
    int medicineId;
    int customerId;
    int quantity;
    double totalPrice;
    Sale(int saleId, int medicineId, int customerId, int quantity, double totalPrice) {
        this.saleId = saleId;
        this.medicineId = medicineId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
    static List<Sale> sales = new ArrayList<>();
    public static void recordSale(Sale s) {
        Medicine m = Medicine.getMedicine(s.medicineId);
        if (m != null && m.quantity >= s.quantity) {
            m.quantity -= s.quantity;
            sales.add(s);
            System.out.println("Sale recorded. Total Price: BDT " + s.totalPrice);
        } else {
            System.out.println("Insufficient stock or medicine not found.");
        }
    }
    public static void viewSales() {
        for (Sale s : sales) {
            System.out.println("Sale ID: " + s.saleId + ", Medicine ID: " + s.medicineId +
                    ", Customer ID: " + s.customerId + ", Quantity: " + s.quantity + ", Total: " +
                    s.totalPrice);
        }
    }
}
