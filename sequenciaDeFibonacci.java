import java.util.Scanner;

public class sequenciaDeFibonacci {
	
	public static boolean pertenceAFibonacci(int numero) {
		if (numero == 0 || numero == 1) {
			return true;
		}
		
		int x = 0;
		int y = 1;
		int fibonacci = x + y;
		
		while (fibonacci <= numero) {
			if (fibonacci == numero) {
				return true;
			}
			x = y;
			y = fibonacci;
			fibonacci = x + y;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Por gentileza, informe o número escolhido: ");
		int numeroEscolhido = scanner.nextInt();
		
		String resposta = pertenceAFibonacci(numeroEscolhido)
		? "Este número pertence à sequência de Fibonacci"
		: "Este número não pertence à sequência de Fibonacci";
		
		System.out.println(resposta);
		}
	}