package lista_Exercicios_2;

import java.util.Scanner;

public class Ex7 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Escreva as coordenadas do eixo X e Y, respectivamente");
		double X = scr.nextDouble();
		double Y = scr.nextDouble();
		
		if(X > 0 && Y > 0) {
			System.out.println("Quadrante 1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Quadrante 2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Quadrante 3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Origem");
		}
		
		scr.close();
	}

}
