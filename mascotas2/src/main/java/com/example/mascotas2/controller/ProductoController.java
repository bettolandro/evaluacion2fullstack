package com.example.mascotas2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mascotas2.model.Producto;
import com.example.mascotas2.service.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos(){
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getProductoById(@PathVariable Long id){
        return productoService.getProductoById(id);
    }

    @PostMapping()
    public String postProducto(@RequestBody Producto prod) {
        Producto p = productoService.addProducto(prod);
        
        return "Producto Agregado Correctamente";
    }

    @PutMapping("/{id}")
    public String putProducto(@PathVariable Long id, @RequestBody Producto prod) {
        
        try {
            Producto p = productoService.updateProducto(id,prod);
            return "Producto Modificado Correctamente";
        } catch (Exception e) {
            return "Producto no encontrado";
        }
        
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id){
        String msj = productoService.deleteProducto(id);
        return msj;
    }
    
}
