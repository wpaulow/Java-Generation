package br.org.generation.vitrinevirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_produto")
public class Produto {
	
	/*em um departamento pode haver vários produtos. lê-se a anotação como
	 * <classeEmQueEstou> se relaciona com <determinadaClasse>, com determinada
	 * cardinalidade. "Muitos produtos para um departamento*/
	
	/**/
	@ManyToOne
	@JsonIgnoreProperties("departamento")
	private Departamento departamento;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="detalhes", length = 500)
	private String detalhes;
	
	@Column(name="preco")
	private float preco;
	
	@Column(name="linkfoto", length = 200)
	private String linkfoto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getLinkFoto() {
		return linkfoto;
	}
	public void setLinkFoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}
	
}
