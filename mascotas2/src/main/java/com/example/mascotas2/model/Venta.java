package com.example.mascotas2.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long id_venta;
    @Column(name = "fecha_venta")
    private Date fecha_venta;
    @Column(name = "nombre_cliente")
    private String nombre_cliente;
    @Column(name = "total_venta")
    private Long total_venta;

    public Long getId_venta() {
        return id_venta;
    }
    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }
    public Date getFecha_venta() {
        return fecha_venta;
    }
    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    public String getNombre_cliente() {
        return nombre_cliente;
    }
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    public Long getTotal_venta() {
        return total_venta;
    }
    public void setTotal_venta(Long total_venta) {
        this.total_venta = total_venta;
    }


}
