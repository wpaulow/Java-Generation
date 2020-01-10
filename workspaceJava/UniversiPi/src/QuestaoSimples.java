
public class QuestaoSimples {
	protected  String enunciado;
	protected String  resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return this.enunciado;
	}
	
	public boolean corrigir (String respostaUser){
		return this.resposta.equals(respostaUser);
		/*Somente a função equals já retorna true ou false, portanto NÃO SE DEVE COLOCAR IF*/
	
	}


	
	
	
	
	
	
}
