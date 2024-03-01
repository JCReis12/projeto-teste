package primeiro_projeto;

import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// Variaveis
		int a,b,soma;
		//Instacionar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.print("Informe o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		b = ler.nextInt();
		
		//Processamento
		soma = a+b;
		//Saída
		System.out.println("Seu resultado é: " + soma);
		
		// Fechando o Scanner
		ler.close();
		

	}

}

