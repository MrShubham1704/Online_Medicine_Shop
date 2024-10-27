package com.demo.Medicine.service;



import com.demo.Medicine_Shop.entities.Medicines;
import java.util.List;

public interface MedicineService {
    Medicines createMedicine(Medicines medicine);    
    List<Medicines> getAllMedicines();
    Medicines getMedicineById(int medicineId);
    Medicines updateMedicine(int medicineId, Medicines updatedMedicine);
    String deleteMedicine(int medicineId);
}
