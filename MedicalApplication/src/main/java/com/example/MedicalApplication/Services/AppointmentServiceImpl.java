package com.example.MedicalApplication.Services;

import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Mappers.AppointmentMapper;

import com.example.MedicalApplication.Repositories.AppointmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Transactional
    public List<AppointmentDto> getAllAppointments() {
        List<Appointment> appointments = appointmentRepository.findAll();

        return appointments.stream()
                .map(AppointmentMapper:: appointmentToAppointmentDto)
                .collect(Collectors.toList());

    }
}
