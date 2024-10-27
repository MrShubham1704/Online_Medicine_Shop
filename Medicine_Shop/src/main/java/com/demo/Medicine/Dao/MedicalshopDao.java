package com.demo.Medicine.Dao;

import com.demo.Medicine_Shop.entities.Medicalshop;
import java.util.List;

public interface MedicalshopDao {
    Medicalshop createMedicalshop(Medicalshop medicalshop);
    List<Medicalshop> getAllMedicalshops();
    Medicalshop getMedicalshopById(int medicalshopId);
    Medicalshop updateMedicalshop(int medicalshopId, Medicalshop updatedMedicalshop);
    String deleteMedicalshop(int medicalshopId);
}
