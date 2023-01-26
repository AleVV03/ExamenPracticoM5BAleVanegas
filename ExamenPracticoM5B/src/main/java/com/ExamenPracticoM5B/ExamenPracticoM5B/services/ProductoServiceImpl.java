/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamenPracticoM5B.ExamenPracticoM5B.services;

import com.ExamenPracticoM5B.ExamenPracticoM5B.models.Producto;
import com.ExamenPracticoM5B.ExamenPracticoM5B.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexandra
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Integer> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, Integer> getDao() {
        return productoRepository;
    }
}
