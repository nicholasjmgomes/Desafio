import java.util.Scanner;

public class ContagemLetraA {
	
	public static int contarLetraA(String frase) {
		int contagem = 0;
		char aMaiusculo = 'A';
		char aMinusculo = 'a';
		
		if (frase == null || frase.isEmpty()) {
			return 0;
		}
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == aMaiusculo || frase.charAt(i) == aMinusculo) {
				contagem++;
			}
		}
		return contagem;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira sua frase aqui: ");
		String texto = scanner.nextLine();
		
		System.out.println("Sua frase contém a letra A, seja maiúscula ou minúscula, " + contarLetraA(texto) + " vezes!");
	}
}