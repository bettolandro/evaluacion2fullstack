package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medica2.model.Consulta;
import com.example.medica2.repository.ConsultaRepository;

@Service
public class ConsultaServiceImpl implements ConsultaService{
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public List<Consulta> getAllConsultas(){
        return consultaRepository.findAll();
    }

    @Override
    public Optional<Consulta> getConsultaById(Long id){
        return consultaRepository.findById(id);
    }

}
