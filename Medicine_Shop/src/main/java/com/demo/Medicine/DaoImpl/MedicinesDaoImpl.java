package com.demo.Medicine.DaoImpl;

import com.demo.Medicine.Dao.MedicinesDao;
import com.demo.Medicine_Shop.entities.Medicines;
import com.demo.Medicine_Shop.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class MedicinesDaoImpl implements MedicinesDao {

    @Override
    public Medicines createMedicine(Medicines medicine) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(medicine);  // Save medicine entity
            session.getTransaction().commit();
            return medicine;
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Medicines> getAllMedicines() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Medicines", Medicines.class).list();  // Fetch all medicines
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Medicines getMedicineById(int medicineId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Medicines.class, medicineId);  // Fetch medicine by ID
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Medicines updateMedicine(int medicineId, Medicines updatedMedicine) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(updatedMedicine);  // Update medicine entity
            session.getTransaction().commit();
            return updatedMedicine;
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public String deleteMedicine(int medicineId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Medicines medicine = session.get(Medicines.class, medicineId);
            if (medicine != null) {
                session.delete(medicine);  // Delete medicine entity
                session.getTransaction().commit();
                return "Medicine deleted successfully.";
            } else {
                return "Medicine not found.";
            }
        } catch (HibernateException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Failed to delete the medicine.";
    }

	@Override
	public Medicines createMedicines(Medicines medicines) {
		// TODO Auto-generated method stub
		return null;
	}
}
