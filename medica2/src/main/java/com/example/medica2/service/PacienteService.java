package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medica2.model.Paciente;

@Service
public interface PacienteService {
    List<Paciente> getAllPacientes ();
    Optional<Paciente> getPacienteById(Long id);
}

