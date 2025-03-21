package lista_Exercicios_4;

import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		
		for (int i=0; i<n; i++) {
			double a = scr.nextDouble();
			double b = scr.nextDouble();
			double c = scr.nextDouble();
			
			double media = (a*2.0 + b*3.0 + c*5.0) / 10;
			
			int aux = i +1;
			System.out.printf("Impriminho a %s média: %.1f%n",aux, media);
		}
			System.out.println("\nFim do programa!");
		scr.close();
	}
}
