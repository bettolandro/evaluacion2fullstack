package com.example.mascotas2.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Venta;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface VentaService {
    List<Venta> getAllVentas ();
    Optional<Venta> getVentaById(Long id);
    Venta addVenta(Venta ven);
    Venta updateVenta(Long id, Venta ven);
    String deleteVenta(Long id);

    Map<LocalDate, Integer> getVentasPorDia();
    Map<String, Integer>    getVentasPorMes();
    Map<Integer, Integer>   getVentasPorAnio();
}
