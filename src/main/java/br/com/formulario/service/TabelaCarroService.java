package br.com.formulario.service;

import java.util.List;

import br.com.formulario.model.TabelaCarro;

public interface TabelaCarroService {

	List<TabelaCarro> listarTodos(); 

	TabelaCarro salvar(TabelaCarro tabelaCarro);
	
	TabelaCarro buscarPorId(Long id);
	
	void delete(Long id);
	
	boolean update(TabelaCarro tabelaCarro);

}
