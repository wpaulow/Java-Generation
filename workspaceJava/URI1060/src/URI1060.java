import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont = 0, a = 1;
		
		float x;
		
		while (a <= 6) {
			//System.out.println("informe um número: ");
			x = teclado.nextFloat();
		
			if (x != 0) {
				a++;
				if (x > 0 ) {
					cont++;
				}
			} else if (x == 0) {
				System.out.println("informe um valor diferente de zero\n");
			}
		}
		System.out.println(cont + " valores positivos");
		
		teclado.close();

	}

}
