package br.com.formulario;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.formulario.model.Formulario;
import br.com.formulario.serviceImpl.FormularioServiceImpl;

@SpringBootTest
class FormularioApplicationTests {
	
	@Autowired
	private FormularioServiceImpl fsi;
	
	/*@Test
	void contextLoads() {
	Formulario fm = new Formulario();
	fm.setNome("Esdras Pinheiro Alves");
	fm.setTelefone("61 98500-0102");
	fm.setEmail("esdras.dev@hotmail.com");
	fm.setEndereco("Qd 103 Cj 04 Cs 08");
	
	
	
	fsi.salvar(fm);
	}
*/
	@Test
	public void lista() {
		List<Formulario> fm = fsi.listarTodos();
		
		System.out.println("Total de registros" + fm.size());

		for (Formulario formulario : fm) {
			System.out.println(formulario.getNome() + "test" + formulario.getEndereco());
			
		}
				
		
	}
	
}
