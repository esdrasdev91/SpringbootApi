package br.com.formulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.formulario.model.Formulario;

@Repository
public interface FormularioRepositorio extends JpaRepository<Formulario, Long> {

	
	
}
