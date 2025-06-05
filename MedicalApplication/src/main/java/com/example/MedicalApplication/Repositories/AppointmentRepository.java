package com.example.MedicalApplication.Repositories;

import com.example.MedicalApplication.Entities.Appointment;
import com.example.MedicalApplication.Enums.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Appointment findByStatus(AppointmentStatus status);

    Appointment findFirstByDateBetweenOrderByDateAsc(LocalDateTime localDateTime, LocalDateTime localDateTime1);
}
