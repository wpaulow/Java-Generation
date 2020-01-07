import java.util.Scanner;

public class URI1164 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int casos, i, j = 0, soma = 0;
		
		String texto;
		
		casos = teclado.nextInt();
		
		int x[] = new int[casos];
		
		for(i=0; i < x.length; i++) {
			x[i] = teclado.nextInt();
			
		}
		
		for(i=0; i < x.length; i++) {
			while (soma < x[i]) {
				j++;
				if(x[i] % j == 0) {
					soma += j;
				}
			}
		
			if (x[i] == soma) {
				System.out.println(x[i] + " eh perfeito");
			} else {
				System.out.println(x[i] + " nao eh perfeito");
			}
			j = 0;
			soma = 0;
		}
	
	}

}
