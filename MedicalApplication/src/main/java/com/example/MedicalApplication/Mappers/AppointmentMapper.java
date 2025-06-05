package com.example.MedicalApplication.Mappers;

import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;

public class AppointmentMapper {
    public static AppointmentDto appointmentToAppointmentDto(Appointment appointment){
        return new AppointmentDto(
                appointment.getId(),
                PatientMapper.patientToPatientDto(appointment.getPatient()),
                appointment.getStatus(),
                appointment.getDate());
    }
}
