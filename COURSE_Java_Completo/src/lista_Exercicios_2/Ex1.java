package lista_Exercicios_2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int x = scr.nextInt();
		
		if(x < 0) {
			System.out.println("Este numero é negativo");
		} else {
			System.out.println("Este numero é positivo");
		}
		
		
		scr.close();
	}

}
