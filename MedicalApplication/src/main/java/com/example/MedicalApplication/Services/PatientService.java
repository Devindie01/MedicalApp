package com.example.MedicalApplication.Services;

import com.example.MedicalApplication.Dtos.PatientDto;
import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Entities.Patient;

import java.util.List;

public interface PatientService {

    List<PatientDto> getAllPatients();
}
