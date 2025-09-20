package com.example.medica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medica2.model.Doctor;
@Repository

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
