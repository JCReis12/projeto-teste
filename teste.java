package primeiro_projeto;

import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		
		Scanner ç = new Scanner(System.in);
		
		double a,b,c,soma,media;
		
		System.out.print("Qual sua primeira nota: ");
		a = ç.nextDouble();
		
		System.out.print("Qual sua segunda nota: ");
		b = ç.nextDouble();
		
		System.out.print("Qual sua terceira nota: ");
		c = ç.nextDouble();
		
		soma = a+b+c;
		
		media = soma/3;
		if (media > 7) {
		
			System.out.print("Sua média é " +media+ ", meus parabéns!!!");
		}
		else if (media == 7) {
			System.out.print("Sua média é " +media+ ", foi bem, mas da para melhorar.");
		}
		else {
			System.out.print("Sua média é " +media+ ", vamos melhorar.");
		}
}
}
