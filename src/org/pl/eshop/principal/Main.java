package org.pl.eshop.principal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.pl.eshop.bd.Conexion;
import org.pl.eshop.dto.Categoria;
import org.pl.eshop.dto.CategoriaDAO;
import org.pl.eshop.dto.CategoriaDAOMySQL;

public class Main {

	public static void main(String[] args) {

		CategoriaDAO catDao = new CategoriaDAOMySQL();

		try {

			System.out.println("-------------------agregar-------------------");
			catDao.agregar(new Categoria(1, "Futbol", "Uniformes de equipos"));

			System.out.println("-------------------agregar-------------------");
			catDao.agregar(new Categoria(2, "Hombre", "Ropa de hombre"));

			System.out.println("-------------------obtenerTodas-------------------");
			List<Categoria> categorias = catDao.obtenerTodas();

			System.out.println("-------------------obtenerPorId-------------------");
			Categoria categoria = catDao.obtenerPorId(1);

			System.out.println("-------------------eliminar-------------------");
			catDao.eliminar(new Categoria(2, "Hombre", "Ropa de hombre"));

			System.out.println("-------------------modificar-------------------");
			catDao.modificar(new Categoria(1, "Futbol", "Guayos"));

			System.out.println("-------------------agregarIlegal-------------------");
			catDao.agregarIlegal(new Categoria(3, "", ""));

		} catch (SQLException e) {
			System.out.println("Hay problemas para acceder a la base de datos: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Hubo un error: " + e.getMessage());
		}

	}

}
