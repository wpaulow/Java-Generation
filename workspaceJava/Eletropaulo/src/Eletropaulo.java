
public class Eletropaulo {

	public static void main(String[] args) {
		
		int qntdKw;
		float valorKw, sal, valor;
		
		sal = Float.parseFloat(args[0]);
		qntdKw = Integer.parseInt(args[1]);
		
		valorKw = sal/700;
		
		valor = qntdKw * valorKw;
		
		System.out.println("O valor em reais de cada kw é " + valorKw);
		
		System.out.println("O valro em reais a ser pago é " + valor);
		
		System.out.println("O novo valor a ser pago por essa residência com 10% de desconto é " + valor * 0.9);
		
		
		

	}

}
