package org.pl.eshop.aspectos;

import org.pl.eshop.dto.Categoria;

public aspect Agregar {

	pointcut callAgregar(): 
		call(void org.pl.eshop.dto.CategoriaDAO.agregar(Categoria)) ;

	after() : callAgregar()  {
		System.out.println("Se agrego una categoria");
	}

}
