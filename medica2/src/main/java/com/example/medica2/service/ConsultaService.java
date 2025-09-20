package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medica2.model.Consulta;

@Service
public interface ConsultaService {
    List<Consulta> getAllConsultas ();
    Optional<Consulta> getConsultaById(Long id);

}
