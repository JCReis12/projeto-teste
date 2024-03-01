package primeiro_projeto;

import java.util.Scanner;
public class Trabalho {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		double horatrab, valorhora, salbruto, salliqui, inss;
		
		System.out.print("Quantas horas você trabalho: ");
		horatrab = jc.nextDouble() ;
		System.out.print("Qual valor da sua hora: ");
		valorhora = jc.nextDouble();
		
		salbruto = horatrab*valorhora;
		
		inss = salbruto*0.12;
				
		salliqui= salbruto - inss;
		
		System.out.println("Seu salario bruto é: "+salbruto);
		System.out.print("Seu salario liquido é: "+salliqui);
		
		
		
		

	}

}
