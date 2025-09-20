package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medica2.model.Doctor;

@Service
public interface DoctorService {
    List<Doctor> getAllDoctors ();
    Optional<Doctor> getDoctorById(Long id);

}
