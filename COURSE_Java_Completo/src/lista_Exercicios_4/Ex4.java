package lista_Exercicios_4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int a = scr.nextInt();
			int b = scr.nextInt();
			
			
			if (b == 0) {
				System.out.println("Divisão impossivel!");
			} else {
				double div = (double) a / b;
				System.out.printf("%.1f%n",div);
			}
		}
		System.out.println("\nFim do programa!");
		
		scr.close();
	}

}
