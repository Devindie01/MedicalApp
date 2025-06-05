package com.example.MedicalApplication.Services;

import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Mappers.AppointmentMapper;

import com.example.MedicalApplication.Repositories.AppointmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.MedicalApplication.Enums.AppointmentStatus.ACTIVE;

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

    public Long getActiveAppointmentId(){
        Appointment appointment = appointmentRepository.findByStatus(ACTIVE);
        if (appointment == null) {
            throw new RuntimeException("No active appointment");
        }

        LocalDate appointmentDate = appointment.getDate().toLocalDate();

        Appointment firstAppointmentOfDay = appointmentRepository.findFirstByDateBetweenOrderByDateAsc(
                appointmentDate.atStartOfDay(),
                appointmentDate.plusDays(1).atStartOfDay()
        );

        if (firstAppointmentOfDay == null) {
            throw new RuntimeException("No appointments for the day");
        }

        return (appointment.getId() - firstAppointmentOfDay.getId() + 1);
    }
}
