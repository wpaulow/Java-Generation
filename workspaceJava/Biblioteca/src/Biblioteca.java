
public class Biblioteca {
	
	private String titulo;
	private String autor;
	private int anoPublic;
	private String categoria;
	private String localizacao;
	private boolean emprestado;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublic() {
		return anoPublic;
	}
	public void setAnoPublic(int anoPublic) {
		this.anoPublic = anoPublic;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public Biblioteca(String titulo, String autor, int anoPublic, String categoria, String localizacao) {
		//super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublic = anoPublic;
		this.categoria = categoria;
		this.localizacao = localizacao;
		this.emprestado = false;
	}
	
	public void emprestarLivro() {
		emprestado = !emprestado;
		System.out.println("O livro "+ titulo +" está " + ((emprestado)?"emprestado":"disponível" ));
		// (testeLogico) ? <ValorSeForVerdadeiro> : <ValorSeForFalso>
	}
	
	

}
