package com.example.medica2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_paciente")
    private Long id_paciente;
    @Column(name= "nombre_completo")
    private String nombre_completo;
    @Column(name = "telefono")
    private Long telefono;
    @Column(name = "correo")
    private String correo;

    public Long getId_paciente() {
        return id_paciente;
    }
    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public Long getTelefono() {
        return telefono;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
