import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int linhas, i = 1;
		
		linhas = teclado.nextInt();
		
		for(i = 1; i <= linhas; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
		
		teclado.close();
		
	}

}
