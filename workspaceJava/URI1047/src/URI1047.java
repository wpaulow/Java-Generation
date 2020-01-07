import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int h0, h1, m0, m1, hTotal, mTotal;
		
		h0 = teclado.nextInt();
		m0 = teclado.nextInt();
		h1 = teclado.nextInt();
		m1 = teclado.nextInt();
		
		hTotal = h1 - h0;
		mTotal = m1 - m0;
		
		if(hTotal == 0) {
			hTotal += 24;
		} 
		
		if(mTotal < 0) {
			mTotal += 60;
			hTotal--;
		}
		
		System.out.print("O JOGO DUROU " + hTotal + " HORA(S) E " + mTotal + " MINUTO(S)");
		
		


	}

}
