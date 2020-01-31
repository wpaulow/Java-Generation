package br.com.eureka.projetointegrador.model;

public class Feed {
	public int idPostagem; 
	public String titulo; 
	public String texto; 
	public String dataInclusao; 
	public String linkImg;
	public int like; 
	public String comentario; 
	
	
	
	// gets e sets dos atributos da classe Feed
	
	public int getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(int idPostagem) {
		this.idPostagem = idPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public String getLinkImg() {
		return linkImg;
	}
	public void setLinkImg(String linkImg) {
		this.linkImg = linkImg;
	} 
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
