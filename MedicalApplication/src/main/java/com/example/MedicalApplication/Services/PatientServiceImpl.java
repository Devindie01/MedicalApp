package com.example.MedicalApplication.Services;

import com.example.MedicalApplication.Dtos.PatientDto;
import com.example.MedicalApplication.Entities.Patient;
import com.example.MedicalApplication.Mappers.PatientMapper;
import com.example.MedicalApplication.Repositories.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public List<PatientDto> getAllPatients() {
        List <Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::patientToPatientDto)
                .collect(Collectors.toList());
    }
}
