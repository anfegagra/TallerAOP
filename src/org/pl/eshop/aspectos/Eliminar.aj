package org.pl.eshop.aspectos;

import org.pl.eshop.dto.Categoria;

public aspect Eliminar {

	pointcut callEliminar(): 
		call(* org.pl.eshop.dto.CategoriaDAO.eliminar(Categoria)) ;

	after() : callEliminar()  {
		System.out.println("Se elimino una categoria");
	}

}
