import java.util.Scanner;

public class URI1101 {
	
	public static void main (String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int x = 0, y = 0, i, soma = 0;
		
		x = teclado.nextInt();
		y = teclado.nextInt();
		while(x > 0 && y > 0) {
			
			if (x > y) {
				for(i = y; i <=x; i++) {
					System.out.print(i + " ");
					soma += i;
				}
				System.out.println("Sum="+soma);
			} else {
				for(i = x; i <= y; i++) {
					System.out.print(i + " ");
					soma += i;
				}
				System.out.println("Sum="+soma);
			} 
			x = teclado.nextInt();
			y = teclado.nextInt();
			
			soma = 0;
			
		}
		
		teclado.close();
	}
}
