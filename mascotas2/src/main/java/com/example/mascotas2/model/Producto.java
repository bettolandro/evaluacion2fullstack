package com.example.mascotas2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "tipo_producto")
    private String tipo_producto;
    @Column(name = "precio")
    private Long precio;

    public Long getId_producto() {
        return id_producto;
    }
    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public Long getStock() {
        return stock;
    }
    public void setStock(Long stock) {
        this.stock = stock;
    }
    public String getTipo_producto() {
        return tipo_producto;
    }
    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }

}
