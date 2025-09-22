package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.medica2.model.Consulta;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface ConsultaService {
    List<Consulta> getAllConsultas ();
    Optional<Consulta> getConsultaById(Long id);
    Consulta addConsulta(Consulta con);
    Consulta updateConsulta(Long id, Consulta prod);
    String deleteConsulta(Long id);
}
