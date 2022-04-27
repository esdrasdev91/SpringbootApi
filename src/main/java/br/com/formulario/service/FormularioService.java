package br.com.formulario.service;

import java.util.List;

import br.com.formulario.model.Formulario;


/*Criando a interface do Crud (create, read, update, delete)*/
public interface FormularioService {
	
	List<Formulario> listarTodos(); 

	Formulario salvar(Formulario formulario);
	
	Formulario buscarPorId(Long id);
	
	void delete(Long id);
	
	boolean update(Formulario formulario);
	
}
