package com.example.mascotas2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mascotas2.model.Detalle_venta;
@Repository

public interface Detalle_VentaRepository extends JpaRepository<Detalle_venta, Long> {

}
