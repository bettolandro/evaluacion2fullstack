package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medica2.model.Doctor;
import com.example.medica2.repository.DoctorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DoctoServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> getDoctorById(Long id){
        return doctorRepository.findById(id);
    }

    @Override
    public Doctor addDoctor(Doctor doc){
        return doctorRepository.save(doc);
    }

    @Override
    public Doctor updateDoctor(Long id,Doctor doc){
        
        return doctorRepository.save(doc);
    }

    @Override
    public String deleteDoctor(Long id){
        try {
            doctorRepository.deleteById(id);
            return "Doctor Eliminado Correctamente";
        } catch (Exception e) {
            return "Doctor no encontrado";
        }
      
    }
}
