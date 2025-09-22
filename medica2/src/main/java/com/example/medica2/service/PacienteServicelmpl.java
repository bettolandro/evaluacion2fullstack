package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medica2.model.Paciente;
import com.example.medica2.repository.PacienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PacienteServicelmpl implements PacienteService{
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> getPacienteById(Long id){
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente addPaciente(Paciente pac){
        return pacienteRepository.save(pac);
    }

    @Override
    public Paciente updatePaciente(Long id,Paciente pac){
        
        return pacienteRepository.save(pac);
    }

    @Override
    public String deletePaciente(Long id){
        try {
            pacienteRepository.deleteById(id);
            return "Paciente Eliminado Correctamente";
        } catch (Exception e) {
            return "Paciente no encontrado";
        }
      
    }
}
