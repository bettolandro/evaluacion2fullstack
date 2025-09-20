package com.example.mascotas2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class Detalle_venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
    private Long id_detalle_venta;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "subtotal")
    private Long subtotal;
    @Column(name = "venta_id_venta")
    private Long venta_id_venta;
    @Column(name = "producto_id_producto")
    private Long producto_id_producto;

    public Long getId_detalle_venta() {
        return id_detalle_venta;
    }
    public void setId_detalle_venta(Long id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }
    public Long getCantidad() {
        return cantidad;
    }
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    public Long getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }
    public Long getVenta_id_venta() {
        return venta_id_venta;
    }
    public void setVenta_id_venta(Long venta_id_venta) {
        this.venta_id_venta = venta_id_venta;
    }
    public Long getProducto_id_producto() {
        return producto_id_producto;
    }
    public void setProducto_id_producto(Long producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }
}
