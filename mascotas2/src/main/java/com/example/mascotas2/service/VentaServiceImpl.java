package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Venta;
import com.example.mascotas2.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> getAllVentas(){
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> getVentaById(Long id){
        return ventaRepository.findById(id);
    }
}
