package org.pl.eshop.aspectos;

import java.util.List;

import org.pl.eshop.dto.Categoria;

public aspect Consulta {

	pointcut callObtenerTodasOPorId(): 
		call(List<Categoria> org.pl.eshop.dto.CategoriaDAO.obtenerTodas()) ||
		call(Categoria org.pl.eshop.dto.CategoriaDAO.obtenerPorId(Integer));

	after() : callObtenerTodasOPorId()  {
		System.out.println("Se realizo una consulta a la base de datos");
	}

}
