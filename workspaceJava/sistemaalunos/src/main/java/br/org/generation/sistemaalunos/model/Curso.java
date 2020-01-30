package br.org.generation.sistemaalunos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.org.generation.sistemaalunos.model.Aluno;

@Entity
@Table(name="tbl_curso")
public class Curso {
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("alunos")
	private List<Aluno> alunos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigocurso")
	private int codigocurso;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="valormensal")
	private float valormensal;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getCodigoCurso() {
		return codigocurso;
	}

	public void setCodigoCurso(int codigocurso) {
		this.codigocurso = codigocurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValormensal() {
		return valormensal;
	}

	public void setValormensal(float valormensal) {
		this.valormensal = valormensal;
	}
	
	
	
	
}
