package lista_Exercicios_2;

import java.util.Scanner;

public class Ex5 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite os valores: ");
		int A = scr.nextInt();
		int B = scr.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Os numeros são multiplos!");
		} else {
			System.out.println("Os numero não são multiplos!");
		}
		scr.close();
	}
}
