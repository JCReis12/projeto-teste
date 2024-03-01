package primeiro_projeto;

import java.util.Scanner;
public class Mult {

	public static void main(String[] args) {
		
		int a,b,mt;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b = ler.nextInt();
		
		mt = a*b;
		
		System.out.print("Seu valor é: " + mt);
		 
		ler.close();
		
		

	}

}
