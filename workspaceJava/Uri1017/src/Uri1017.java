import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int horas, velocidade;
		float distancia, litros;
		
		horas = keyboard.nextInt();
		
		velocidade = keyboard.nextInt();
		
		distancia = velocidade * horas;
		
		litros = distancia / 12;
		
		System.out.printf("%.3f\n", litros);
		
		keyboard.close();
		

	}

}
