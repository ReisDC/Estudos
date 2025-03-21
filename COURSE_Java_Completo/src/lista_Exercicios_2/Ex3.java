package lista_Exercicios_2;

import java.util.Scanner;
// Esta atividade foi pedida para ser feita com if-else, porém, eu preferi faze-la utilizando switchcase
public class Ex3 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		double resultado = 0;
		
		System.out.println("CÓDIGO		PRODUTO				PREÇO\n"
						 + "1		Cachorro Quente			R$4.00\n"
						 + "2		X-salada			R$4.50\n"
						 + "3		X-bacon				R$5.00\n"
						 + "4		Torrada simples			R$2.00\n"
						 + "5		Refrigerante			R$1.50\n\n"
						 + "Escolha seu pedido e a quantidade:");
		int pedido = scr.nextInt();
		double qnte = scr.nextInt();
		switch(pedido){
		case 1:
			resultado = 4 * qnte;
			break;
		case 2:
			resultado = (450 * qnte) / 100;
			break;
		case 3:
			resultado = 5 * qnte;
			break;
		case 4:
			resultado = 2 * qnte;
			break;
		case 5: 
			resultado = (150 * qnte) / 100;
			break;
		default:
			System.out.println("Produto não encontrado");
		}
		
		System.out.printf("Total: R$%.2f%n", resultado);
		
		scr.close();
	}

}
