package com.example.medica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medica2.model.Consulta;
import com.example.medica2.repository.ConsultaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
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

    @Override
    public Consulta addConsulta(Consulta con){
        return consultaRepository.save(con);
    }

    @Override
    public Consulta updateConsulta(Long id,Consulta con){
        
        return consultaRepository.save(con);
    }

    @Override
    public String deleteConsulta(Long id){
        try {
            consultaRepository.deleteById(id);
            return "Consulta Eliminado Correctamente";
        } catch (Exception e) {
            return "Consulta no encontrado";
        }
      
    }
}
