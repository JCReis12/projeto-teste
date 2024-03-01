package primeiro_projeto;

import java.util.Scanner;
public class teste2 {

	public static void main(String[] args) {

		Scanner ç = new Scanner(System.in);
		
		int pedido;
		
		System.out.println(" ");
		System.out.println("     SEJA BEM VINDO A PIZZARIA JVCABAÇO");
		System.out.println(" ");
		System.out.println(" -----------------------------------------");
		System.out.println("|           SABORES DISPONÍVEIS           |");
		System.out.println("|         01 - Pizza de mussarela         |");
		System.out.println("|         02 - Pizza de calabresa         |");
		System.out.println("|    03 - Pizza de frango com catupiry    |");
		System.out.println("|      04 - Pizza de acelga e bacon       |");
		System.out.println("|  05 - Pizza de brocolis com carne seca  |");
		System.out.println(" -----------------------------------------");
		
		System.out.println("Qual o número da pizza que você quer: ");
		pedido = ç.nextInt();
		
		if (pedido == 01){
		System.out.print("01 - Pizza de mussarela ............ (R$ 27,00)");
		}
		
		else if (pedido == 02){ 
		System.out.print("02 - Pizza de calabresa ............ (R$ 29,00)");
		} 

		else if (pedido == 03){ 
		System.out.print("03 - Pizza de frango com catupiry ............ (R$ 32,00)");
		} 

		else if (pedido == 04){ 
		System.out.print("04 - Pizza de acelga e bacon ............ (R$ 30,00)");
		} 

		else if (pedido == 05){ 
		System.out.print("05 - Pizza de brocolis com carne seca ............ (R$ 30,00)");
		} 
	
		else {
		System.out.println("Nenhum pedido selecionado");
	}
  }
}

