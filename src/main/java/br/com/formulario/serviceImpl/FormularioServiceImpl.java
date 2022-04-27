package br.com.formulario.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.formulario.model.Formulario;
import br.com.formulario.repository.FormularioRepositorio;
import br.com.formulario.service.FormularioService;


/*Fazendo implementação Crud (criando as condições)*/

@Service
public class FormularioServiceImpl implements FormularioService {

	@Autowired
	private FormularioRepositorio formularioRepositorio; 
	
	@Override
	public List<Formulario> listarTodos() {
 		List<Formulario> fm = new ArrayList<>();
 		formularioRepositorio.findAll().forEach(fm::add);
		return fm;
		
	}

	@Override
	public Formulario salvar(Formulario formulario) {
		// TODO Auto-generated method stub
		return formularioRepositorio.save(formulario);
	}

	@Override
	public Formulario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return formularioRepositorio.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		formularioRepositorio.deleteById(id);
	}

	@Override
	public boolean update(Formulario formulario) {
		// TODO Auto-generated method stub
		try {
			formularioRepositorio.save(formulario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}