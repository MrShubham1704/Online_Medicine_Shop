package com.demo.Medicine_Shop;

import java.util.Scanner;
import static com.demo.Medicine_Shop.Alloperation.*; // Corrected the import for the Alloperation class

public class MainOperation {

    static Scanner sc = new Scanner(System.in);

    public static void mainOps() {
        System.out.println("Welcome..!!!\n");
        while (true) {
            System.out.println(
                    "Press 1: User Details \n" +
                    "Press 2: Medical Shop Details\n" +
                    "Press 3: Medicines Details \n" +
                    "Press 4: Order Details\n" +
                    "Press 5: Quit");
            int input = sc.nextInt();

            switch (input) {
//                case 1:
//                    loginOperations(); // Calls Login operations
//                    System.out.println("=======================================");
//                    break;
                case 1:
                    userOperations(); // Calls User operations
                    System.out.println("=======================================");
                    break;
                case 2:
                    medicalshopOperations(); // Calls Medical shop operations
                    System.out.println("=======================================");
                    break;
                case 3:
                    medicinesOperations(); // Calls Medicine operations
                    System.out.println("=======================================");
                    break;
                case 4:
                    orderOperations(); // Properly calls Order operations
                    System.out.println("=======================================");
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        mainOps(); // Start main operations
    }
}