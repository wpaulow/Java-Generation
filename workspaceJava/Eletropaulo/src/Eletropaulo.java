
public class Eletropaulo {

	public static void main(String[] args) {
		
		int qntdKw;
		float valorKw, sal, valor;
		
		sal = Float.parseFloat(args[0]);
		qntdKw = Integer.parseInt(args[1]);
		
		valorKw = sal/700;
		
		valor = qntdKw * valorKw;
		
		System.out.println("O valor em reais de cada kw � " + valorKw);
		
		System.out.println("O valro em reais a ser pago � " + valor);
		
		System.out.println("O novo valor a ser pago por essa resid�ncia com 10% de desconto � " + valor * 0.9);
		
		
		

	}

}
