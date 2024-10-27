package com.demo.Medicine.DaoImpl;



import com.demo.Medicine.Dao.MedicalshopDao;
import com.demo.Medicine_Shop.entities.Medicalshop;
import com.demo.Medicine_Shop.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MedicalshopDaoImpl implements MedicalshopDao {

    @Override
    public Medicalshop createMedicalshop(Medicalshop medicalshop) {
    	Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	 transaction = session.beginTransaction();
           
            session.save(medicalshop);  // Save Medicalshop entity
            transaction.commit();
            return medicalshop;
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Medicalshop> getAllMedicalshops() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Medicalshop", Medicalshop.class).list();  // Fetch all medicalshops
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Medicalshop getMedicalshopById(int medicalshopId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Medicalshop.class, medicalshopId);  // Fetch Medicalshop by ID
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    
    public Medicalshop updateMedicalshop(int medId, Medicalshop updatedMedicalshop) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Fetch the medical shop by its ID
            Medicalshop existingMedicalshop = session.get(Medicalshop.class, medId);

            if (existingMedicalshop != null) {
                // Log the values before updating
                System.out.println("Updating MedName from: " + existingMedicalshop.getMedName() + " to: " + updatedMedicalshop.getMedName());

                existingMedicalshop.setMedName(updatedMedicalshop.getMedName());
                existingMedicalshop.setMedAddress(updatedMedicalshop.getMedAddress());
                existingMedicalshop.setMedType(updatedMedicalshop.getMedType());

                session.update(existingMedicalshop);  // Perform the update
                transaction.commit();

                // Log the values after updating
                System.out.println("Updated MedName: " + existingMedicalshop.getMedName());

                return existingMedicalshop;
            } else {
                System.out.println("No medical shop found with MedId: " + medId);
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
    public String deleteMedicalshop(int medicalshopId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Medicalshop medicalshop = session.get(Medicalshop.class, medicalshopId);
            if (medicalshop != null) {
                session.delete(medicalshop);  // Delete Medicalshop entity
                session.getTransaction().commit();
                return "Medicalshop deleted successfully.";
            } else {
                return "Medicalshop not found.";
            }
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Failed to delete the Medicalshop.";
    }
}
