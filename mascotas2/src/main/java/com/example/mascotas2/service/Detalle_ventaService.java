package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Detalle_venta;

@Service
public interface Detalle_ventaService {
    List<Detalle_venta> getAllDetalle_ventas();
    Optional<Detalle_venta> getDetalle_ventaById(Long id);
}
