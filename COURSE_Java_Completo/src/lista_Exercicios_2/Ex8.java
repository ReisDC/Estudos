package lista_Exercicios_2;

import java.util.Scanner;

public class Ex8 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Informe sua renda: ");
		double renda = scr.nextDouble();
		double imposto;
		
		if(renda <= 2000.00) {
			imposto = 0.0;
		} else if (renda <= 3000.00) {
			imposto = (renda - 2000) * 0.08;
		} else if (renda <= 4500.00) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
		} else {
			imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento!");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		scr.close();
	}

}
