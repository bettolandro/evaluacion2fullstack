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

import com.example.medica2.model.Consulta;
import com.example.medica2.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> getAllConsultas(){
        return consultaService.getAllConsultas();
    }  
    
    @GetMapping("/{id}")
    public Optional<Consulta> getConsultaById(@PathVariable Long id){
    return consultaService.getConsultaById(id);
    }

    @PostMapping()
    public String postConsulta(@RequestBody Consulta con) {
        Consulta c = consultaService.addConsulta(con);
        
        return "Consulta Agregada Correctamente";
    }

    @PutMapping("/{id}")
    public String putConsulta(@PathVariable Long id, @RequestBody Consulta con) {
        
        try {
            Consulta c = consultaService.updateConsulta(id,con);
            return "Consulta Modificada Correctamente";
        } catch (Exception e) {
            return "Consulta no encontrada";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarConsulta(@PathVariable Long id){
        String msj = consultaService.deleteConsulta(id);
        return msj;
    }
    
}
