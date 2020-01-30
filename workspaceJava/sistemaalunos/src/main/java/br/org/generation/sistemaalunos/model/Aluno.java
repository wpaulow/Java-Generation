package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import br.org.generation.sistemaalunos.model.Curso;

@Entity
@Table(name="tbl_aluno")
public class Aluno {
	
	@ManyToOne
	@JsonIgnoreProperties("curso")
	private Curso curso;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ra")
	private int ra;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	
	@Column(name="linkfoto", length = 200)
	private String linkfoto;

	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getLinkfoto() {
		return linkfoto;
	}

	public void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}
	
	
}
