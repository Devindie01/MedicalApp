package com.example.MedicalApplication.Repositories;

import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


}
