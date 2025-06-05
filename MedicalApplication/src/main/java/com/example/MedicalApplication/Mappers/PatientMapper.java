package com.example.MedicalApplication.Mappers;

import com.example.MedicalApplication.Dtos.PatientDto;
import com.example.MedicalApplication.Entities.Patient;

public class PatientMapper {
    public static PatientDto patientToPatientDto(Patient patient) {
        if (patient == null) return null;
        return new PatientDto(
                patient.getId(),
                patient.getName(),
                patient.getPhoneNumber(),
                patient.getDateOfBirth(),
                patient.getEmail()
        );
    }
}
