package Lista_Exercicios_3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Qual combustível você abasteceu?\n"
						 + "1.Álcool\n"
						 + "2.Gasolina\n"
						 + "3.Diesel\n"
						 + "4.Sair ");
		int comb = scr.nextInt();
		int alcool = 0;
		int gas = 0;
		int diesel = 0;
		while (comb != 4){
			
			if (comb == 1) {
				alcool += 1;
				System.out.println("Álcool selecionado!");
			} else if (comb == 2) {
				gas += 1;
				System.out.println("Gasolina selecionado!");
			} else if (comb == 3) {
				diesel += 1;
				System.out.println("Diesel selecionado!");
			} 
			comb = scr.nextInt();
		}
		
		System.out.println("Muito Obrigado!\n"
				  +"Alcool: " + alcool + "\n"
				  +"Gasolina: " + gas + "\n"
				  +"Diesel: " + diesel + "\n");
		
		scr.close();
	}
}
