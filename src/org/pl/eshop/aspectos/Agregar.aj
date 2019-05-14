package org.pl.eshop.aspectos;

import org.aspectj.lang.Signature;

import org.pl.eshop.dto.Categoria;

public aspect Agregar {

	pointcut callAgregar(): 
		call(void org.pl.eshop.dto.CategoriaDAO.agregar(Categoria)) ;

	after() : callAgregar()  {
		System.out.println("Se agrego una categoria");

		// Ejemplo de joinpoint estatico
		Signature sig = thisJoinPointStaticPart.getSignature();
		String linea = "" + thisJoinPointStaticPart.getSourceLocation().getLine();

		String fuente = thisJoinPointStaticPart.getSourceLocation().getWithinType().getCanonicalName();
		//
		System.out.println("LLamado desde " + fuente + " linea " + linea + "\n   a " + sig.getDeclaringTypeName() + "."
				+ sig.getName() + "\n");
	}

}
