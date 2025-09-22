package com.example.mascotas2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas2.model.Producto;
import com.example.mascotas2.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> getProductoById(Long id){
        return productoRepository.findById(id);
    }

    @Override
    public Producto addProducto(Producto prod){
        return productoRepository.save(prod);
    }

    @Override
    public Producto updateProducto(Long id,Producto prod){
        
        return productoRepository.save(prod);
    }

    @Override
    public String deleteProducto(Long id){
        try {
            productoRepository.deleteById(id);
            return "Producto Eliminado Correctamente";
        } catch (Exception e) {
            return "Producto no encontrado";
        }
      
    }
}
