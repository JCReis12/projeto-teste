package primeiro_projeto;

import java.util.Scanner;
public class Atvsenai {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome;

		System.out.println("Qual seu nome: ");
		nome = ler.nextLine();

		System.out.println("Qual sua idade: ");
		idade = ler.nextInt();

		System.out.print("Olá, "+nome+" de "+idade+" anos!");


		ler.close();
	}

}
