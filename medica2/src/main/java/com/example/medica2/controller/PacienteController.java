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

import com.example.medica2.model.Paciente;
import com.example.medica2.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAllPacientes(){
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{id}")
    public Optional<Paciente> getPacienteById(@PathVariable Long id){
        return pacienteService.getPacienteById(id);
    }

    @PostMapping()
    public String postPaciente(@RequestBody Paciente pac) {
        Paciente p = pacienteService.addPaciente(pac);
        
        return "Paciente Agregado Correctamente";
    }

    @PutMapping("/{id}")
    public String putPaciente(@PathVariable Long id, @RequestBody Paciente pac) {
        
        try {
            Paciente p = pacienteService.updatePaciente(id,pac);
            return "Paciente Modificado Correctamente";
        } catch (Exception e) {
            return "Paciente no encontrado";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable Long id){
        String msj = pacienteService.deletePaciente(id);
        return msj;
    }
    
}
