package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Detalle_venta;
import com.example.mascotas2.repository.Detalle_VentaRepository;

@Service
public class Detalle_ventaServiceImpl implements Detalle_ventaService{
    @Autowired
    private Detalle_VentaRepository detalle_VentaRepository;

    @Override
    public List<Detalle_venta> getAllDetalle_ventas(){
        return detalle_VentaRepository.findAll();
    }

    @Override
    public Optional<Detalle_venta> getDetalle_ventaById(Long id){
        return detalle_VentaRepository.findById(id);
    }

    @Override
    public Detalle_venta addDetalle_venta(Detalle_venta det){
        return detalle_VentaRepository.save(det);
    }

    @Override
    public Detalle_venta updateDetalle_venta(Long id,Detalle_venta det){
        
        return detalle_VentaRepository.save(det);
    }

    @Override
    public String deleteDetalle_venta(Long id){
        try {
            detalle_VentaRepository.deleteById(id);
            return "Detalle de la venta se Eliminó Correctamente";
        } catch (Exception e) {
            return "Detalle de la venta no se encontró";
        }
      
    }
}
