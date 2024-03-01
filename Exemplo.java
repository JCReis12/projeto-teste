package primeiro_projeto;

import java.util.Scanner;
public class Exemplo {

	public static void main(String[] args) {
		
		// Variáveis
		int a,b,sub;
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextInt();
		
		sub = a-b;
		
		System.out.println("Seu valor é: " + sub);
		
		ler.close();
				
	}
	
}
