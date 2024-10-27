package com.demo.Medicine.serviceImpl;



import com.demo.Medicine.Dao.MedicinesDao;
import com.demo.Medicine.DaoImpl.MedicinesDaoImpl;
import com.demo.Medicine_Shop.entities.Medicines;
import com.demo.Medicine.service.MedicineService;

import java.util.List;

public class MedicinesServiceImpl implements MedicineService {

    // Dependency on MedicinesDao
    private MedicinesDao medicinesDao = new MedicinesDaoImpl();

    @Override
    public Medicines createMedicine(Medicines medicine) {
        // Invoke MedicinesDaoImpl method to save the medicine object
        return medicinesDao.createMedicine(medicine);
    }

    @Override
    public List<Medicines> getAllMedicines() {
        // Invoke MedicinesDaoImpl method to retrieve all medicines
        return medicinesDao.getAllMedicines();
    }

    @Override
    public Medicines getMedicineById(int medicineId) {
        // Invoke MedicinesDaoImpl method to retrieve a specific medicine by medicineId
        return medicinesDao.getMedicineById(medicineId);
    }

    @Override
    public Medicines updateMedicine(int medicineId, Medicines updatedMedicine) {
        // Invoke MedicinesDaoImpl method to update the medicine's details
        return medicinesDao.updateMedicine(medicineId, updatedMedicine);
    }

    @Override
    public String deleteMedicine(int medicineId) {
        // Invoke MedicinesDaoImpl method to delete a medicine by medicineId
        return medicinesDao.deleteMedicine(medicineId);
    }
}
