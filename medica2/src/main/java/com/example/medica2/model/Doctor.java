package com.example.medica2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private Long id_doctor;
    @Column(name = "nombre_completo_doctor")
    private String nombre_completo_doctor;
    @Column(name = "correo_doctor")
    private String correo_doctor;
    @Column(name = "especialidad")
    private String especialidad;

    public Long getId_doctor() {
        return id_doctor;
    }
    public void setId_doctor(Long id_doctor) {
        this.id_doctor = id_doctor;
    }
    public String getNombre_completo_doctor() {
        return nombre_completo_doctor;
    }
    public void setNombre_completo_doctor(String nombre_completo_doctor) {
        this.nombre_completo_doctor = nombre_completo_doctor;
    }
    public String getCorreo_doctor() {
        return correo_doctor;
    }
    public void setCorreo_(String correo_doctor) {
        this.correo_doctor = correo_doctor;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
