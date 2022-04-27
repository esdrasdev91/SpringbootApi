package br.com.formulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.formulario.model.TabelaCarro;

public interface TabelaCarroRepositorio extends JpaRepository<TabelaCarro, Long> {

}
