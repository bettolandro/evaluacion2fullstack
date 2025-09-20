package com.example.medica2.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Long id_consulta;
    @Column(name = "fecha_consulta")
    private Date fecha_consulta;
    @Column(name = "especialidad_consulta")
    private String especialidad_consulta;
    @Column(name = "observacion_consulta")
    private String observacion_consulta;
    @Column(name = "id_paciente")
    private Long id_paciente;
    @Column(name = "id_doctor")
    private Long id_doctor;
    
    public Long getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }
    public Date getFecha_consulta() {
        return fecha_consulta;
    }
    public void setFecha_consulta(Date fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }
    public String getEspecialidad_consulta() {
        return especialidad_consulta;
    }
    public void setEspecialidad_consulta(String especialidad_consulta) {
        this.especialidad_consulta = especialidad_consulta;
    }
    public String getObservacion_consulta() {
        return observacion_consulta;
    }
    public void setObservacion_consulta(String observacion_consulta) {
        this.observacion_consulta = observacion_consulta;
    }
    public Long getId_paciente() {
        return id_paciente;
    }
    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }
    public Long getId_doctor() {
        return id_doctor;
    }
    public void setId_doctor(Long id_doctor) {
        this.id_doctor = id_doctor;
    }
}
