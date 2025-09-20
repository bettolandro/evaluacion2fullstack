package com.example.medica2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
}
