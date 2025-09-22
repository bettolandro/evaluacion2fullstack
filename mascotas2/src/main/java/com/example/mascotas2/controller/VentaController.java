package com.example.mascotas2.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas2.model.Venta;
import com.example.mascotas2.service.VentaService;
import org.springframework.web.bind.annotation.PutMapping;


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

    @PostMapping
    public String postVenta(@RequestBody Venta ven){
        Venta v = ventaService.addVenta(ven);

        return "Venta agregada correctamente";
    }

    @PutMapping("/{id}")
    public String putVenta(@PathVariable Long id, @RequestBody Venta ven) {
        
        try{
            Venta v = ventaService.updateVenta(id, ven);
            return "Venta Modificada Correctamente";
        }catch (Exception e){
            return "Venta no Encontrada";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable Long id){
        String msj = ventaService.deleteVenta(id);
        return msj;
    }

    @GetMapping("/ventas/dia")
    public Map<LocalDate, Integer> getVentasPorDia() {
        return ventaService.getVentasPorDia();
    }

    @GetMapping("/ventas/mes")
    public Map<String, Integer> getVentasPorMes() {
        return ventaService.getVentasPorMes();
    }

    @GetMapping("/ventas/anio")
    public Map<Integer, Integer> getVentasPorAnio() {
        return ventaService.getVentasPorAnio();
    }
}
