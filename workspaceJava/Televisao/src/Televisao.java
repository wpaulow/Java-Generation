public class Televisao {
	
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String _marca) {
		this.marca = _marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int _voltagem) {
		this.voltagem = _voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int _tamanho) {
		this.tamanho = _tamanho;
	}
	//padr�o de mercado n�o tem get pra boolean, e sim "is"
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean _ligada) {
		this.ligada = _ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int _volume) {
		this.volume = _volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int _canal) {
		this.canal = _canal;
	}	
	
	public void switchPower() {
		ligada = !ligada;
		System.out.println("A Tv "+ marca +" esta " + ((ligada)?"ligada":"desligada" ));
		// (testeLogico) ? <ValorSeForVerdadeiro> : <ValorSeForFalso>
	}
	
	public void aumentarVolume() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			volume++;
			if(volume > 10) {
				System.out.println("A TV "+marca+" esta no volume maximo");
			}
			else {
				System.out.println("A TV "+marca+" esta no volume "+volume);
			}			
		}
	}
	
	public void diminuirVolume() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			volume--;
			if(volume < 1) {
				System.out.println("A TV "+marca+" esta no mudo");
			}
			else {		
				System.out.println("A TV "+marca+" esta no volume "+volume);
			}
		}
	}
	
	public void avancarCanal() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			canal++;
			if(canal > 10) {
				canal = 1;
			}
			else {
				
				System.out.println("A TV "+marca+" esta no canal "+canal);
			}
		}
	}
	
	public void voltarCanal() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			canal--;
			if(canal < 1) {
				canal = 10;
			}
			else {
				System.out.println("A TV "+marca+" esta no canal "+canal);
			}
		}
	}	

}