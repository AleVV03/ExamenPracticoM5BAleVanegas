/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamenPracticoM5B.ExamenPracticoM5B.repositorio;

import com.ExamenPracticoM5B.ExamenPracticoM5B.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alexandra
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
