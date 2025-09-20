package com.example.mascotas2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mascotas2.model.Producto;
@Repository

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
