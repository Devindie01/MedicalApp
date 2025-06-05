package com.example.MedicalApplication.Repositories;

import com.example.MedicalApplication.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


}
