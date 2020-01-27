package br.org.generation.integracaojpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//lembrar sempre que anotações são comentários úteis

@Entity                    //indico que a class aluno é uma entidade armazenável em banco
@Table(name="tbl_aluno")   //associo explicitamente o nome da tabela que armazena
public class Aluno {
	
	@Column(name="ra")     //defino que o atributo agora é uma coluna da tabela
	@Id				       //esse atributo é chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //indica que RA é auto-gerado pelo banco de dados
	private int ra;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="email", length = 100, unique = true)
	private String email;
	
	@Column(name="telefone", length = 20)
	private String telefone;
	
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
