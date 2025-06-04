package com.example.MedicalApplication.Entities;

import com.example.MedicalApplication.Enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "patient_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    private LocalDateTime date;
}
