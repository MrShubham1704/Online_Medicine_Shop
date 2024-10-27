package com.demo.Medicine.serviceImpl;

import com.demo.Medicine.Dao.MedicalshopDao;
import com.demo.Medicine.DaoImpl.MedicalshopDaoImpl;
import com.demo.Medicine_Shop.entities.Medicalshop;
import com.demo.Medicine.service.MedicalshopService;

import java.util.List;

public class MedicalshopServiceImpl implements MedicalshopService {

    // Dependency on MedicalshopDao
    private MedicalshopDao medicalshopDao = new MedicalshopDaoImpl();

    @Override
    public Medicalshop createMedicalshop(Medicalshop medicalshop) {
        // Invoke MedicalshopDaoImpl method to save medicalshop entity
        return medicalshopDao.createMedicalshop(medicalshop);
    }

    @Override
    public List<Medicalshop> getAllMedicalshops() {
        // Invoke MedicalshopDaoImpl method to retrieve all medicalshops
        return medicalshopDao.getAllMedicalshops();
    }

    @Override
    public Medicalshop getMedicalshopById(int medicalshopId) {
        // Invoke MedicalshopDaoImpl method to retrieve a specific medicalshop by medicalshopId
        return medicalshopDao.getMedicalshopById(medicalshopId);
    }

    @Override
    public Medicalshop updateMedicalshop(int medicalshopId, Medicalshop updatedMedicalshop) {
        // Invoke MedicalshopDaoImpl method to update the medicalshop's details
        return medicalshopDao.updateMedicalshop(medicalshopId, updatedMedicalshop);
    }

    @Override
    public String deleteMedicalshop(int medicalshopId) {
        // Invoke MedicalshopDaoImpl method to delete a medicalshop by medicalshopId
        return medicalshopDao.deleteMedicalshop(medicalshopId);
    }
}
