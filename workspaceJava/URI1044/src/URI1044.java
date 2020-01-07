import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b;
		
		a = teclado.nextInt();
		
		b = teclado.nextInt();
		
		if (b % a == 0 || a % b == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		teclado.close();

	}

}
