import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float v1, v2, v3, A, B, C;
		
		v1 = teclado.nextFloat();
	
		v2 = teclado.nextFloat();
		
		v3 = teclado.nextFloat();

		if (v1 > v2 && v1 > v3) {
			A = v1;
			if (v2 > v3) {
				B = v2;
				C = v3;
			} else {
				B = v3;
				C = v2;
			}
		} else if (v2 > v1 && v2 > v3) {
			A = v2;
			if (v1 > v3) {
				B = v1;
				C = v3;
			} else {
				B = v3;
				C = v1;
			}
		} else {
			A = v3;
			if (v1 > v2) {
				B = v1;
				C = v2;
			} else {
				B = v2;
				C = v1;
			}
		}

		if (A >= (B + C)) {
			
			System.out.println("NAO FORMA TRIANGULO");
			
		} else if (A * A == B * B + C * C){
			
			System.out.println("TRIANGULO RETANGULO");
			
			if (A == B && A == C && B == C) {
				
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if (A == B || B == C || A == C) {
				
				System.out.println("TRIANGULO ISOSCELES");
				
			}
			
		} else if (A * A > B * B + C * C) {

			System.out.println("TRIANGULO OBTUSANGULO");

			if (A == B && A == C && B == C) {
				
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if (A == B || B == C || A == C) {
				
				System.out.println("TRIANGULO ISOSCELES");
				
			}
			
		} else if (A * A < B * B + C * C) {

			System.out.println("TRIANGULO ACUTANGULO");

			if (A == B && A == C && B == C) {
				
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if (A == B || B == C || A == C) {
				
				System.out.println("TRIANGULO ISOSCELES");
				
			}
			
		}

		/*escreva("A = ", A, "\n")
		escreva("B = ", B, "\n")
		escreva("C = ", C, "\n")*/
		
	}

	}


