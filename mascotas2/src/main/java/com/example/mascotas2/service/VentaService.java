package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Venta;

@Service
public interface VentaService {
    List<Venta> getAllVentas ();
    Optional<Venta> getVentaById(Long id);
}
