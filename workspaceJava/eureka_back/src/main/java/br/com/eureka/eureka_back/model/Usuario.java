package br.com.eureka.eureka_back.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cadastro_usuario")
public class Usuario {
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, 
    fetch = FetchType.LAZY, optional = true)
	private PerfilUsuario perfilusuario;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_id_usuario")
	private int id_usuario;
	
	@Column(name="email", length = 100)
	private String email;
	
	@Column(name="nome_usuario", length = 100)
	private String nome_usuario;
	
	@Column(name="senha", length = 32)
	private String senha;
	
	@Column(name="telefone", length = 20)
	private String telefone;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
