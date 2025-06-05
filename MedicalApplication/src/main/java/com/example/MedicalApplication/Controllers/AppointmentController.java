package com.example.MedicalApplication.Controllers;

import com.example.MedicalApplication.Dtos.AppointmentDto;
import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
