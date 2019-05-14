package org.pl.eshop.aspectos;

import org.pl.eshop.dto.Categoria;

public aspect Modificar {

	pointcut callModificar(): 
		call(* org.pl.eshop.dto.CategoriaDAO.modificar(Categoria)) ;

	after() : callModificar()  {
		System.out.println("Se modifico una categoria");
	}

}
