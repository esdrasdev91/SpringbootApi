package br.com.formulario.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.formulario.model.TabelaCarro;
import br.com.formulario.repository.TabelaCarroRepositorio;
import br.com.formulario.service.TabelaCarroService;

@Service
public class TabelaCarroServiceImpl implements TabelaCarroService {
	@Autowired
	private TabelaCarroRepositorio carro;

	@Override
	public List<TabelaCarro> listarTodos() {

		List<TabelaCarro> tc = new ArrayList<>();
		carro.findAll();
		return tc;

	}

	@Override
	public TabelaCarro salvar(TabelaCarro tabelaCarro) {
		// TODO Auto-generated method stub
		return carro.save(tabelaCarro);

	}

	@Override
	public TabelaCarro buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return (TabelaCarro) carro.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carro.deleteById(id);
		
	}

	@Override
	public boolean update(TabelaCarro tabelaCarro) {
		try {
			carro.save(tabelaCarro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
	}

}
