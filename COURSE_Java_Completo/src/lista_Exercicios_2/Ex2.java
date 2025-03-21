package lista_Exercicios_2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int x = scr.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("Este numero é par");
		} else {
			System.out.println("Este núero é impar");
		}
		
		scr.close();
	}
}
