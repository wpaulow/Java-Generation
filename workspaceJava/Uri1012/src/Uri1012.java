import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double a, b, c, aTri, aCirc, aTrap, aQuad, aRet, pi;

		pi = 3.14159;

		a = keyboard.nextDouble();

		b = keyboard.nextDouble();

		c = keyboard.nextDouble();

		aTri = (a * c) / 2;

		aCirc = pi * c * c;

		aTrap = (a + b) * c / 2;

		aQuad = b * b;

		aRet = a * b;

		System.out.printf("TRIANGULO %.3f\n", aTri);
		System.out.printf("CIRCULO %.3f\n", aCirc);
		System.out.printf("TRAPEZIO %.3f\n", aTrap);
		System.out.printf("QUADRADO %.3f\n", aQuad);
		System.out.printf("RETANGULO %.3f", aRet);

		keyboard.close();
		
		
	}

	

}
