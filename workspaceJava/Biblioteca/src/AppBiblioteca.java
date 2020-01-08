import java.util.Scanner;

public class AppBiblioteca {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numLivro;
		
		Biblioteca l1 = new Biblioteca("Habibi", "Craig Thompson", 2011, "Romance Gráfico", "1/1");
		Biblioteca l2 = new Biblioteca("Habibinho", "Craig Thompson", 2011, "Romance Gráfico", "1/2");
		Biblioteca l3 = new Biblioteca("Habibin", "Craig Thompson", 2011, "Romance Gráfico", "1/3");
		Biblioteca l4 = new Biblioteca("Habibo", "Craig Thompson", 2011, "Romance Gráfico", "1/4");
		Biblioteca l5 = new Biblioteca("Habibs", "Craig Thompson", 2011, "Romance Gráfico", "1/5");
		
		do {
					System.out.println("Informe o número do livro que deseja: ");
					System.out.println("\n-------------------------");
					System.out.println("1  - Habibi");
					System.out.println("2  - Habibinho");
					System.out.println("3  - Habibin");
					System.out.println("4  - Habibo");
					System.out.println("5  - Habibs");
					System.out.println("0  - Encerrar Sistema");
					numLivro = keyboard.nextInt();
					switch(numLivro) {
						case 1:
							if (l1.isEmprestado() == true) {
								System.out.println("O livro está emprestado.");
							} else {
								System.out.println("O livro está disponível.");
								System.out.println("Você deseja emprestar o livro? 1 - sim ; 2 - não");
								int op = keyboard.nextInt();
								if (op == 1) {
									l1.emprestarLivro();
								} else {
									System.out.println("Tudo bem, então.");
								}
							}

							break;
						case 2:
							if (l2.isEmprestado() == true) {
								System.out.println("O livro está emprestado.");
							} else {
								System.out.println("O livro está disponível.");
								System.out.println("Você deseja emprestar o livro? 1 - sim ; 2 - não");
								int op = keyboard.nextInt();
								if (op == 1) {
									l2.emprestarLivro();
								} else {
									System.out.println("Tudo bem, então.");
								}
							}
							break;
						case 3:
							if (l3.isEmprestado() == true) {
								System.out.println("O livro está emprestado.");
							} else {
								System.out.println("O livro está disponível.");
								System.out.println("Você deseja emprestar o livro? 1 - sim ; 2 - não");
								int op = keyboard.nextInt();
								if (op == 1) {
									l3.emprestarLivro();
								} else {
									System.out.println("Tudo bem, então.");
								}
							}
							break;
						case 4:
							if (l4.isEmprestado() == true) {
								System.out.println("O livro está emprestado.");
							} else {
								System.out.println("O livro está disponível.");
								System.out.println("Você deseja emprestar o livro? 1 - sim ; 2 - não");
								int op = keyboard.nextInt();
								if (op == 1) {
									l4.emprestarLivro();
								} else {
									System.out.println("Tudo bem, então.");
								}
							}
							break;
						case 5:
							if (l5.isEmprestado() == true) {
								System.out.println("O livro está emprestado.");
							} else {
								System.out.println("O livro está disponível.");
								System.out.println("Você deseja emprestar o livro? 1 - sim ; 2 - não");
								int op = keyboard.nextInt();
								if (op == 1) {
									l5.emprestarLivro();
								} else {
									System.out.println("Tudo bem, então.");
								}
							}
							break;
					}
			
		}while(numLivro !=0);

}

}
