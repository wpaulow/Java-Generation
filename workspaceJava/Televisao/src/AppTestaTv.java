import java.util.Scanner;


public class AppTestaTv {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Televisao t1 = new Televisao();
		
		t1.setMarca("Sony");
		t1.setVoltagem(110);
		t1.setTamanho(32);
		t1.setLigada(false);
		t1.setCanal(5);
		t1.setVolume(2);
		
		do {
			System.out.println("\n***************************");
			System.out.println("   Controle Remoto da TV   ");
			System.out.println("1  - Ligar/Desligar");
			System.out.println("2  - Aumentar Volume");
			System.out.println("3  - Diminuir Volume");
			System.out.println("4  - Avancar Canal");
			System.out.println("5  - Voltar Canal");
			System.out.println("-1 - Encerrar Sistema");

			opcao = teclado.nextInt();
			
			switch(opcao) {
				case 1:
					t1.switchPower();
					break;
				case 2:
					t1.aumentarVolume();
					break;
				case 3:
					t1.diminuirVolume();
					break;
				case 4:	
					t1.avancarCanal();
					break;
				case 5:
					t1.voltarCanal();
					break;		
			}
			
			
		}while(opcao != -1);
		
		teclado.close();
		
	}
}