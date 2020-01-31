package br.com.eureka.eureka_back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_perfil_usuario")
public class PerfilUsuario {
	
	@MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_usuario")
	private Usuario usuario;
	
	@Id
	private int id_usuario;
	
	@Column(name="foto_perfil", length = 255)
	private String foto_perfil;
	
	@Column(name="descricao")
	private String descricao;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getFoto_perfil() {
		return foto_perfil;
	}

	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
