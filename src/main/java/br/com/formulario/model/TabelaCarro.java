package br.com.formulario.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class TabelaCarro {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String modelo;
	private String ano;
	private String preco;
	
	public TabelaCarro() {  /*Criação construtor vazio*/
	
	}

		/*Criação construtor com atributos*/
	public TabelaCarro(Long id, String nome, String modelo, String ano, String preco) { 
		super();
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	
	/*Criação Getters e Setters com todos atributos*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	/*hashCode para ajudar a identificar os atributos*/
	@Override
	public int hashCode() {
		return Objects.hash(ano, id, modelo, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabelaCarro other = (TabelaCarro) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(id, other.id) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	@Override
	public String toString() {
		return "TabelaCarro [id=" + id + ", nome=" + nome + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco
				+ "]";
	}
	
	
	

}
