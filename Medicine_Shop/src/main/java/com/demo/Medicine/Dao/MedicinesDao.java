package com.demo.Medicine.Dao;

import java.util.List;

import com.demo.Medicine_Shop.entities.Medicines;

public interface MedicinesDao {
    Medicines createMedicine(Medicines medicines);
    List<Medicines> getAllMedicines();  // Fixed plural class name issue
    Medicines getMedicineById(int medicineId);
    Medicines updateMedicine(int medicineId, Medicines updatedMedicine);
    String deleteMedicine(int medicineId);
	Medicines createMedicines(Medicines medicines);
}