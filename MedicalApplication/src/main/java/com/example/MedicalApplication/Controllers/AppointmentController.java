package com.example.MedicalApplication.Controllers;

import com.example.MedicalApplication.Dtos.AppointmentCreationDto;
import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController (AppointmentService appointmentService){
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<AppointmentDto> getAllAppointments(){
        return  appointmentService.getAllAppointments();
    }

    @GetMapping("/active")
    public Long getActiveAppoinmentId(){
        return appointmentService.getActiveAppointmentId();
    }

    @GetMapping("/total")
    public int getTotalAppointmentsPerDay() {
        return appointmentService.getTotalAppointmentsPerDay();
    }
    @GetMapping("/completed")
    public int getCompletedAppointmentsPerDay() {
        return appointmentService.getTotalCompletedAppointmentsPerDay();
    }// Assuming this method is implemented to count completed appointments

    @PostMapping("/create")
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentCreationDto appointmentDto) {
        AppointmentDto createdAppointment = appointmentService.createAppointment(appointmentDto);
        return ResponseEntity.ok(createdAppointment);
    }

}
