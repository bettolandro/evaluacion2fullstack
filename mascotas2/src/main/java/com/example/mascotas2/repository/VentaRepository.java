package com.example.mascotas2.repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mascotas2.model.Venta;

@Repository

public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Ventas por día (YYYY-MM-DD)
    @Query(value = """
            SELECT TRUNC(v.fecha_venta) AS dia,
                   SUM(v.total_venta)    AS total
              FROM VENTA v
             GROUP BY TRUNC(v.fecha_venta)
             ORDER BY TRUNC(v.fecha_venta)
            """, nativeQuery = true)
    List<VentasPorDiaRow> sumByDay();

    interface VentasPorDiaRow {
         java.sql.Timestamp getDia();   // antes: java.sql.Date
        java.math.BigDecimal getTotal();
    }

    // Ventas por mes (periodo = 'YYYY-MM')
    @Query(value = """
            SELECT TO_CHAR(v.fecha_venta, 'YYYY-MM') AS periodo,
                   SUM(v.total_venta)                AS total
              FROM VENTA v
             GROUP BY TO_CHAR(v.fecha_venta, 'YYYY-MM')
             ORDER BY TO_CHAR(v.fecha_venta, 'YYYY-MM')
            """, nativeQuery = true)
    List<VentasPorMesRow> sumByMonth();

    interface VentasPorMesRow {
        String getPeriodo(); // 'YYYY-MM'

        BigDecimal getTotal();
    }

    // Ventas por año (YYYY)
    @Query(value = """
            SELECT EXTRACT(YEAR FROM v.fecha_venta) AS anio,
                   SUM(v.total_venta)               AS total
              FROM VENTA v
             GROUP BY EXTRACT(YEAR FROM v.fecha_venta)
             ORDER BY EXTRACT(YEAR FROM v.fecha_venta)
            """, nativeQuery = true)
    List<VentasPorAnioRow> sumByYear();

    interface VentasPorAnioRow {
        Integer getAnio();

        BigDecimal getTotal();
    }
}
