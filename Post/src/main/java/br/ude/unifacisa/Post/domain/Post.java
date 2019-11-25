package br.ude.unifacisa.Post.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Post implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@javax.persistence.Id
	private String id;
	private String titulo; 
	private String descricao;
	
	public Post(String id, String titulo, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

	
	
	
	

}
