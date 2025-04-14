package PMS;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\nPHARMACY MANAGEMENT SYSTEM");
            System.out.println("1. Add Medicine");
            System.out.println("2. View Medicines");
            System.out.println("3. Add Customer");
            System.out.println("4. View Customers");
            System.out.println("5. Record Sale");
            System.out.println("6. View Sales");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Medicine ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Medicine Name: ");
                    String mname = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int mqty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double mprice = sc.nextDouble();
                    Medicine.addMedicine(new Medicine(mid, mname, mqty, mprice));
                    break;
                case 2:
                    Medicine.viewMedicines();
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String cname = sc.nextLine();
                    Customer.addCustomer(new Customer(cid, cname));
                    break;
                case 4:
                    Customer.viewCustomers();
                    break;
                case 5:
                    System.out.print("Enter Sale ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter Medicine ID: ");
                    int smid = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int scid = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int sqty = sc.nextInt();
                    Medicine med = Medicine.getMedicine(smid);
                    if (med != null) {
                        double total = sqty * med.price;
                        Sale.recordSale(new Sale(sid, smid, scid, sqty, total));
                    } else {
                        System.out.println("Medicine not found.");
                    }
                    break;
                case 6:
                    Sale.viewSales();
                    break;
                case 7:
                    System.out.println("Exiting system.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
