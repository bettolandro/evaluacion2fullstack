package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Detalle_venta;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface Detalle_ventaService {
    List<Detalle_venta> getAllDetalle_ventas();
    Optional<Detalle_venta> getDetalle_ventaById(Long id);
    Detalle_venta addDetalle_venta(Detalle_venta deta);
    Detalle_venta updateDetalle_venta(Long id, Detalle_venta deta);
    String deleteDetalle_venta(Long id);
}
