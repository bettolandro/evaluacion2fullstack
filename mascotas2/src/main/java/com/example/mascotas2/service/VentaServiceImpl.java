package com.example.mascotas2.service;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Venta;
import com.example.mascotas2.repository.VentaRepository;
import com.example.mascotas2.repository.VentaRepository.VentasPorAnioRow;
import com.example.mascotas2.repository.VentaRepository.VentasPorDiaRow;
import com.example.mascotas2.repository.VentaRepository.VentasPorMesRow;

import jakarta.transaction.Transactional;

@Service
@Transactional
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

    @Override
    public Venta addVenta(Venta ven){
        return ventaRepository.save(ven);
    }

    @Override
    public Venta updateVenta(Long id,Venta ven){

        return ventaRepository.save(ven);
    }

    @Override
    public String deleteVenta(Long id){
        try {
            ventaRepository.deleteById(id);
            return "Producto Eliminado Correctamente";
        }catch (Exception e) {
            return "Producto no encontrado";
        }
        
    }

    @Override
    public Map<LocalDate, Integer> getVentasPorDia() {
        List<VentasPorDiaRow> rows = ventaRepository.sumByDay();
        Map<LocalDate, Integer> out = new LinkedHashMap<>();
        for (VentasPorDiaRow r : rows) {
            LocalDate dia = r.getDia().toLocalDateTime().toLocalDate(); // java.sql.Date -> LocalDate
            int total = r.getTotal() != null ? r.getTotal().intValue() : 0;
            out.put(dia, total);
        }
        return out; // Ordenado por día asc (gracias al ORDER BY en la query)
    }

    @Override
    public Map<String, Integer> getVentasPorMes() {
        List<VentasPorMesRow> rows = ventaRepository.sumByMonth();
        Map<String, Integer> out = new LinkedHashMap<>();
        for (VentasPorMesRow r : rows) {
            int total = r.getTotal() != null ? r.getTotal().intValue() : 0;
            out.put(r.getPeriodo(), total); // 'YYYY-MM'
        }
        return out; // Ordenado por periodo asc
    }

    @Override
    public Map<Integer, Integer> getVentasPorAnio() {
        List<VentasPorAnioRow> rows = ventaRepository.sumByYear();
        Map<Integer, Integer> out = new LinkedHashMap<>();
        for (VentasPorAnioRow r : rows) {
            int total = r.getTotal() != null ? r.getTotal().intValue() : 0;
            out.put(r.getAnio(), total); // 2023, 2024, ...
        }
        return out; // Ordenado por año asc
    }
}
