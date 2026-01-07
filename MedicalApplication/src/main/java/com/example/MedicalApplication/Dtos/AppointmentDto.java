package com.example.MedicalApplication.Dtos;

import com.example.MedicalApplication.Entities.Patient;
import com.example.MedicalApplication.Enums.AppointmentStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private int appointmentNo;
    private PatientDto patient;
    private AppointmentStatus status;
    private LocalDateTime date;

}
