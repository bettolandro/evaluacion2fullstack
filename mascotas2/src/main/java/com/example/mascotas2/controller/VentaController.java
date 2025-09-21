package com.example.mascotas2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas2.model.Venta;
import com.example.mascotas2.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAllVentas(){
        return ventaService.getAllVentas();
    }

    @GetMapping("/{id}")
    public Optional<Venta>  getVentaById(@PathVariable Long id){
        return ventaService.getVentaById(id);
    }
}
