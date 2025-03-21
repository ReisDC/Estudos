package lista_Exercicios_4;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scr.nextInt();
		
		for (int i = 1; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scr.close();
	}
}