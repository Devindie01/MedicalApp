package com.example.MedicalApplication.Services;

import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AppointmentService {

    List<AppointmentDto> getAllAppointments();
}
