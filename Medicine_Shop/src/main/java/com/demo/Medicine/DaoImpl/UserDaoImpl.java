package com.demo.Medicine.DaoImpl;

import com.demo.Medicine.Dao.UserDao;
import com.demo.Medicine_Shop.entities.User;
import com.demo.Medicine_Shop.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public User createUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(user);  // Insert user into the database (UserId will be auto-generated)

            transaction.commit();
            return user;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public List<User> getAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from User", User.class).list();  // Fetch all users
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(int userId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(User.class, userId);  // Fetch user by ID
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User updateUser(int userId, User updatedUser) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            User existingUser = session.get(User.class, userId);

            if (existingUser != null) {
                // Update the existing user details with updatedUser fields
                existingUser.setUserName(updatedUser.getUserName());
               // existingUser.setPassword(updatedUser.getPassword());
                existingUser.setUsermail(updatedUser.getUsermail());
                // Add other fields to update as necessary
                existingUser.setUserphone(updatedUser.getUserphone());
                existingUser.setUseraddress(updatedUser.getUseraddress());

                session.update(existingUser);  // Update user entity in the database
                transaction.commit();
                return existingUser;
            }
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, userId);

            if (user != null) {
                session.delete(user);  // Delete user from the database
                transaction.commit();
                return "User deleted successfully.";
            } else {
                return "User not found.";
            }
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return "Failed to delete user due to database error.";
        }
    }
}
