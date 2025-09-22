package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medica2.model.Paciente;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface PacienteService {
    List<Paciente> getAllPacientes ();
    Optional<Paciente> getPacienteById(Long id);
    Paciente addPaciente(Paciente pac);
    Paciente updatePaciente(Long id, Paciente pac);
    String deletePaciente(Long id);
}

 