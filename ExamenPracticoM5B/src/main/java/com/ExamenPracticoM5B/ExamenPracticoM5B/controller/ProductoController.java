/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ExamenPracticoM5B.ExamenPracticoM5B.controller;

import com.ExamenPracticoM5B.ExamenPracticoM5B.models.Producto;
import com.ExamenPracticoM5B.ExamenPracticoM5B.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexandra
 */
@RestController
public class ProductoController {
    @Autowired
    ProductoService clienteService;

    @GetMapping("/listar")
    public ResponseEntity< List<Producto>> obtenerLista() {
        return new ResponseEntity<>(clienteService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Producto> crear(@RequestBody Producto c){
     return new ResponseEntity<>(clienteService.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarcliente/{id}")
	public Producto findbyid(@PathVariable Integer id){
		return clienteService.findById(id);
	}
        @PutMapping("/editarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto edit(@RequestBody Producto objeto, @PathVariable Integer id) {
		Producto productoedit=clienteService.findById(id);
		productoedit.setDescripcion(objeto.getDescripcion());
		productoedit.setPrecio(objeto.getPrecio());
		productoedit.setCantidad(objeto.getCantidad());
		return clienteService.save(productoedit);
	}
	
	@DeleteMapping("/eliminarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@PathVariable Integer id) {
		clienteService.delete(id);
	}
}
