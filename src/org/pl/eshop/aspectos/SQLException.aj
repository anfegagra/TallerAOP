package org.pl.eshop.aspectos;

public aspect SQLException {

	pointcut handleSQLException(): 
		handler(java.sql.SQLException);

	before() : handleSQLException()  {
		System.out.println("Ocurrio una SQLException");
	}

}
