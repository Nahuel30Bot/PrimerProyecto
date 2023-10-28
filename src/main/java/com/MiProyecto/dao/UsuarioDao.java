package com.MiProyecto.dao;

import java.util.List;
import com.MiProyecto.model.Usuario;
import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	List<Usuario> getUsuarios();

	void eliminar(Long id);
	void registrar(Usuario usuario);

	boolean verificarCredenciales(Usuario usuario);

	

	
}
