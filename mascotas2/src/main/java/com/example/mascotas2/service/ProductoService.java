package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Producto;

@Service
public interface ProductoService {
    List<Producto> getAllProductos();
    Optional<Producto> getProductoById(Long id);
}
