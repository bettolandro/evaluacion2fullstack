package com.example.medica2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medica2.model.Doctor;
import com.example.medica2.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable Long id){
        return doctorService.getDoctorById(id);
    }

    @PostMapping()
    public String postDoctor(@RequestBody Doctor doc) {
        Doctor d = doctorService.addDoctor(doc);
        
        return "Doctor Agregado Correctamente";
    }

    @PutMapping("/{id}")
    public String putDoctor(@PathVariable Long id, @RequestBody Doctor doc) {
        
        try {
            Doctor d = doctorService.updateDoctor(id,doc);
            return "Doctor Modificado Correctamente";
        } catch (Exception e) {
            return "Doctor no encontrado";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarDoctor(@PathVariable Long id){
        String msj = doctorService.deleteDoctor(id);
        return msj;
    }
}
