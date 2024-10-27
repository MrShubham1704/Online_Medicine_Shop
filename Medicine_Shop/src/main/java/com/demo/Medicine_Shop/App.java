package com.demo.Medicine_Shop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.Medicine_Shop.entities.Login;

public class App {
    public static void main(String[] args) {
        // Obtain a Hibernate SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        // Create a new Login object (without specifying loginId since it is auto-generated)
        Login login1 = new Login("Shubham Bukam", "Shubham@123");
        
        // Open a new session
        Session session = factory.openSession();
        
        // Begin a transaction
        Transaction transaction = session.beginTransaction();
        
        // Save the login to the database
        session.save(login1);
        
        // Commit the transaction
        transaction.commit();
        
        // Close the Session and SessionFactory
        session.close();
        factory.close();
    }
}