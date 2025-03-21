package Lista_Exercicios_3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas (X / Y): ");
		int x = scr.nextInt();
		int y = scr.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante!");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante!");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante!");
			} else {
				System.out.println("Quarto Quadrante!");
			}
			
			x = scr.nextInt();
			y = scr.nextInt();
		}
		
		scr.close();
	}

}
