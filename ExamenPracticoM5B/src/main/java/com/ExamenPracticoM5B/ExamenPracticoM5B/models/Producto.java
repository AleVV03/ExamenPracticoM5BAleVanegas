/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamenPracticoM5B.ExamenPracticoM5B.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Alexandra
 */
@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;
    
    @Column(name = "cantidad")
    private Integer cantidad;
}
