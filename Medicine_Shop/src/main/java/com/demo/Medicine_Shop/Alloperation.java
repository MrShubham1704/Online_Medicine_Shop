package com.demo.Medicine_Shop;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;



import com.demo.Medicine.service.MedicalshopService;
import com.demo.Medicine.service.MedicineService;
import com.demo.Medicine.service.OrderService;
import com.demo.Medicine.service.UserService;

import com.demo.Medicine.serviceImpl.MedicalshopServiceImpl;
import com.demo.Medicine.serviceImpl.MedicinesServiceImpl;
import com.demo.Medicine.serviceImpl.OrderServiceImpl;
import com.demo.Medicine.serviceImpl.UserServiceImpl;

import com.demo.Medicine_Shop.entities.Medicalshop;
import com.demo.Medicine_Shop.entities.Medicines;
import com.demo.Medicine_Shop.entities.Order;
import com.demo.Medicine_Shop.entities.User;

public class Alloperation {

	private static final Integer Interger = null;
	static Scanner sc = new Scanner(System.in);
	static UserService userService = new UserServiceImpl();
	static MedicalshopService medicalShopService = new MedicalshopServiceImpl();
	static MedicineService medicinesService = new MedicinesServiceImpl();
	static OrderService orderService = new OrderServiceImpl();
//	static LoginService loginService = new LoginServiceImpl();

//	// Operations for Login
//	public static void loginOperations() {
//		while (true) {
//			System.out.println("Press 1: Add Login\nPress 2: Retrieve All Logins\n"
//					+ "Press 3: Update Login\nPress 4: Delete Login\nPress 5: Back to Main Menu");
//			int input = sc.nextInt();
//			sc.nextLine();
//
//			switch (input) {
//			case 1:
//
//				System.out.println("Enter Login Username:");
//				String username = sc.nextLine();
//				System.out.println("Enter User Password:");
//				String password = sc.nextLine();
//
//				Login newLogin = new Login( username, password);
//				loginService.createLogin(newLogin);
//				System.out.println("Login added successfully!");
//				break;
//
//			case 2:
//				List<Login> logins = loginService.getAllLogins();
//				if (logins == null || logins.isEmpty()) {
//					System.out.println("No logins found.");
//				} else {
//					logins.forEach(System.out::println);  // Print each login
//				}
//				break;
//
//
//			case 3:
//				System.out.println("Enter Login ID to update:");
//				String updateLoginId = sc.nextLine();  // Expecting String type for loginId
//				Login existingLogin = loginService.getLoginById(updateLoginId);  // Now uses String
//				if (existingLogin != null) {
//					System.out.println("Enter new Username:");
//					existingLogin.setLoginUserName(sc.nextLine());
//					System.out.println("Enter new Password:");
//					existingLogin.setUserpassword(sc.nextLine());
//					loginService.updateLogin(updateLoginId, existingLogin);  // Now uses String
//					System.out.println("Login updated successfully!");
//				} else {
//					System.out.println("Login ID not found.");
//				}
//				break;
//
//			case 4:
//				System.out.println("Enter Login ID to delete:");
//				String deleteLoginId = sc.nextLine();  // Change to String type for loginId
//				String result = loginService.deleteLogin(deleteLoginId);
//				System.out.println(result);
//				break;
//
//
//
//			case 5:
//				return;
//
//			default:
//				System.out.println("Invalid choice, please try again.");
//			}
//		}
//	}
//
//	// Input method for Login
//	public static Login loginInputs() {
//		System.out.println("Enter Login ID:");
//		String loginId = sc.nextLine();
//		System.out.println("Enter Login Username:");
//		String username = sc.nextLine();
//		System.out.println("Enter User Password:");
//		String password = sc.nextLine();
//		return new Login( username, password);
//	}


	public static void userOperations() {
		while (true) {
			System.out.println("Press 1: Add User\nPress 2: Retrieve All Users\n"
					+ "Press 3: Update User\nPress 4: Delete User\nPress 5: Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				// Add User
				User newUser = userInputs();
				userService.createUser(newUser);
				System.out.println("User added successfully!");
				break;

			case 2:
				// Retrieve all Users
				List<User> users = userService.getAllUsers();
				users.forEach(System.out::println);
				break;

			case 3:
				// Update User
				System.out.println("Enter User ID to update:");
				int updateUserId = sc.nextInt();
				sc.nextLine(); // Consume newline
				User existingUser = userService.getUserById(updateUserId);
				if (existingUser != null) {
					User updatedUser = userInputs();
					userService.updateUser(updateUserId, updatedUser);
					System.out.println("User updated successfully!");
				} else {
					System.out.println("User ID not found.");
				}
				break;

			case 4:
				// Delete User
				System.out.println("Enter User ID to delete:");
				Integer deleteUserId =sc.nextInt();
				sc.nextLine(); // Consume newline
				userService.deleteUser(deleteUserId);
				System.out.println("User deleted successfully!");
				break;

			case 5:
				// Go back to Main Menu
				return;

			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}


	public static User userInputs() {
		//        System.out.println("Enter User ID:");
		//        Integer userId = sc.nextInt(); // Assuming User ID is an integer
		sc.nextLine(); // Consume newline

		System.out.println("Enter Username:");
		String username = sc.nextLine();

		System.out.println("Enter Phone:");
		String phone = sc.nextLine();

		System.out.println("Enter Email:");
		String email = sc.nextLine();

		System.out.println("Enter Address:");
		String address = sc.nextLine();

		return new User( username, phone, email, address);
	}

	// Operations for Medical Shop
	public static void medicalshopOperations() {
		while (true) {
			System.out.println("Press 1: Add Medical Shop\nPress 2: Retrieve All Medical Shops\n"
					+ "Press 3: Update Medical Shop\nPress 4: Delete Medical Shop\nPress 5: Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				// Add Medical Shop
				Medicalshop newMedicalShop = medicalShopInputs();
				medicalShopService.createMedicalshop(newMedicalShop);
				System.out.println("Medical Shop added successfully!" + newMedicalShop);
				break;

			case 2:
				// Retrieve all Medical Shops
				List<Medicalshop> medicalShops = medicalShopService.getAllMedicalshops();
				medicalShops.forEach(System.out::println);
				break;

			case 3:
				// Update Medical Shop
				System.out.println("Enter Medical Shop ID to update:");
				int updateMedShopId = sc.nextInt();
				Medicalshop existingMedShop = medicalShopService.getMedicalshopById(updateMedShopId);
				if (existingMedShop != null) {
					Medicalshop updatedMedShop = medicalShopInputs();
					medicalShopService.updateMedicalshop(updateMedShopId, updatedMedShop);
					System.out.println("Medical Shop updated successfully!"+updatedMedShop);
				} else {
					System.out.println("Medical Shop ID not found.");
				}
				break;

			case 4:
				// Delete Medical Shop
				System.out.println("Enter Medical Shop ID to delete:");
				int deleteMedShopId = sc.nextInt();
				medicalShopService.deleteMedicalshop(deleteMedShopId);
				System.out.println("Medical Shop deleted successfully!");
				break;

			case 5:
				return;

			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}

	// Input method for Medicalshop
	public static Medicalshop medicalShopInputs() {
		//        System.out.println("Enter Medical Shop ID:");
		//        String medShopId = sc.nextLine();
		System.out.println("Enter Medical Shop Name:");
		String medShopName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Medical Shop Type:");

		String medShopType = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Medical Shop Address:");
		String medShopAddress = sc.nextLine();
		return new Medicalshop(medShopName, medShopType, medShopAddress);
	}

	// Operations for Medicines
	public static void medicinesOperations() {
		while (true) {
			System.out.println("Press 1: Add Medicine\nPress 2: Retrieve All Medicines\n"
					+ "Press 3: Update Medicine\nPress 4: Delete Medicine\nPress 5: Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				// Add Medicine
				Medicines newMedicine = medicinesInputs();
				medicinesService.createMedicine(newMedicine);
				System.out.println("Medicine added successfully!");
				break;

			case 2:
				// Retrieve all Medicines
				List<Medicines> medicines = medicinesService.getAllMedicines();
				medicines.forEach(System.out::println);
				break;

			case 3:
				// Update Medicine
				System.out.println("Enter Medicine ID to update:");
				int updateMedcnId = sc.nextInt();
				Medicines existingMedicine = medicinesService.getMedicineById(updateMedcnId);
				if (existingMedicine != null) {
			        // Get updated medicine details from input
			        Medicines updatedMedicine = medicinesInputs();

			        // Set the existing ID in the updated medicine object
			        updatedMedicine.setMdcnId(existingMedicine.getMdcnId());

			        // Now update the medicine
			        medicinesService.updateMedicine(updateMedcnId, updatedMedicine);
			        System.out.println("Medicine updated successfully!");
			    } else {
			        System.out.println("Medicine ID not found.");
			    }
			    break;

			case 4:
				// Delete Medicine
				System.out.println("Enter Medicine ID to delete:");
				int deleteMedId = sc.nextInt();
				medicinesService.deleteMedicine(deleteMedId);
				System.out.println("Medicine deleted successfully!");
				break;

			case 5:
				return;

			default:
				System.out.println("Invalid choice, please try again.");
			}
		}
	}

	// Input method for Medicines
	public static Medicines medicinesInputs() {
	    //        System.out.println("Enter Medicine ID:");
	    //        String medId = sc.nextLine();
		sc.nextLine();
	    System.out.println("Enter Medicine Name:");
	    String medName = sc.nextLine();
	    sc.nextLine();
	    System.out.println("Enter Medicine Cost:");
	    String medCost = sc.nextLine();
	    System.out.println("Enter Manufacture Date (yyyy-mm-dd):");
	    LocalDate medDate = LocalDate.parse(sc.nextLine());
	    System.out.println("Enter Expiry Date (yyyy-mm-dd):");
	    LocalDate expiryDate = LocalDate.parse(sc.nextLine()); 

	    // Return Medicines object with correct variable names
	    return new Medicines(medName, medCost, medDate, expiryDate );  
	}


	// Operations for Orders
	public static void orderOperations() {
	    while (true) {
	        System.out.println("Press 1: Add Order\nPress 2: Retrieve All Orders\n"
	                + "Press 3: Update Order\nPress 4: Delete Order\nPress 5: Back to Main Menu");
	        int input = sc.nextInt();
	        sc.nextLine(); // Consume newline

	        switch (input) {
	            case 1:
	                // Add Order
	                Order newOrder = orderInputs();
	                orderService.saveOrder(newOrder);
	                System.out.println("Order added successfully!");
	                break;

	            case 2:
	                // Retrieve all Orders
	                List<Order> orders = orderService.getAllOrders();
	                orders.forEach(System.out::println);
	                break;

	            case 3:
	                // Update Order
	                System.out.println("Enter Order ID to update:");
	                int updateOrderId = sc.nextInt();
	                Order existingOrder = orderService.getOrderById(updateOrderId);
	                if (existingOrder != null) {
	                    // Get updated order details from input
	                    Order updatedOrder = orderInputs();
	                    
	                    // Set the existing ID in the updated order object
	                    updatedOrder.setOrderId(existingOrder.getOrderId());

	                    // Now update the order
	                    orderService.updateOrder(updatedOrder);
	                    System.out.println("Order updated successfully!");
	                } else {
	                    System.out.println("Order ID not found.");
	                }
	                break;

	            case 4:
	                // Delete Order
	                System.out.println("Enter Order ID to delete:");
	                int deleteOrderId = sc.nextInt();
	                orderService.deleteOrder(deleteOrderId);
	                System.out.println("Order deleted successfully!");
	                break;

	            case 5:
	                return;

	            default:
	                System.out.println("Invalid choice, please try again.");
	        }
	    }
	}

	// Input method for Orders
	public static Order orderInputs() {
	    System.out.println("Enter Medicine ID for the order:");
	    int medicineId = sc.nextInt(); // Assume you have a way to validate this exists
	    System.out.println("Enter Order Item Quantity:");
	    int orderItemQty = sc.nextInt();
	    sc.nextLine(); // Consume newline
	    System.out.println("Enter Order Status:");
	    String orderStatus = sc.nextLine();

	    // Return Order object with correct variable names
	    // Assuming you have a method to fetch Medicines by ID
	    Medicines medicine = medicinesService.getMedicineById(medicineId);
	    return new Order(medicine, orderItemQty, orderStatus);
	}
	
}