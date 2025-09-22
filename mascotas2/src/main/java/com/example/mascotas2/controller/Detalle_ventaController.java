package com.example.mascotas2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas2.model.Detalle_venta;
import com.example.mascotas2.service.Detalle_ventaService;

@RestController
@RequestMapping("/detalle_venta")
public class Detalle_ventaController {
    @Autowired
    private Detalle_ventaService detalle_ventaService;

    @GetMapping
    public List<Detalle_venta> getAllDetalle_ventas(){
        return detalle_ventaService.getAllDetalle_ventas();
    }

    @GetMapping("/{id}")
    public Optional<Detalle_venta> getDetalle_ventaById(@PathVariable Long id){
        return detalle_ventaService.getDetalle_ventaById(id);
    }

    @PostMapping()
    public String postDetalle_venta(@RequestBody Detalle_venta det) {
        Detalle_venta d = detalle_ventaService.addDetalle_venta(det);
        
        return "Detalle de la venta se agregó Correctamente";
    }

    @PutMapping("/{id}")
    public String putDetalle_venta(@PathVariable Long id, @RequestBody Detalle_venta det) {
        
        try {
            Detalle_venta d = detalle_ventaService.updateDetalle_venta(id,det);
            return "Detalle de venta se modificó Correctamente";
        } catch (Exception e) {
            return "Detalle de venta no encontrado";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarDetalle_venta(@PathVariable Long id){
        String msj = detalle_ventaService.deleteDetalle_venta(id);
        return msj;
    }
}