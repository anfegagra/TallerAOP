/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

/**
 *
 * @author andres.granados
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.pl.eshop.bd.Conexion;

public interface CategoriaDAO {

	public void agregar(Categoria c) throws Exception;

	public void agregarIlegal(Categoria c) throws Exception;

	public void modificar(Categoria c) throws Exception;

	public void eliminar(Categoria c) throws Exception;

	public List<Categoria> obtenerTodas() throws Exception;

	public Categoria obtenerPorId(Integer id) throws Exception;
}
