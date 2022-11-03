package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entidades.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
	
	@Query("SELECT p FROM Producto p WHERE" 
			+ " CONCAT(p.id,p.nombre,p.marca,p.precio,p.hechoEn,p.stock)"
			+ " LIKE %?1%")
	public List<Producto> findAll(String palabraClave);

}
