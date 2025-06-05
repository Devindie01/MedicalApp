package com.example.MedicalApplication.Dtos;

import com.example.MedicalApplication.Entities.Patient;
import com.example.MedicalApplication.Enums.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;
    private PatientDto patient;
    private AppointmentStatus status;
    private LocalDateTime date;

}
