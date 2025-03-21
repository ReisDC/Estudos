package lista_Exercicios_2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int conclusao;
		System.out.println("Digite a hora inicial e final do jogo: ");
		int Hinicial = scr.nextInt();
		int Hfinal = scr.nextInt();
		
		if(Hinicial < Hfinal) {
			conclusao = Hfinal - Hinicial;
		} else {
			conclusao = 24 - Hinicial + Hfinal;
		}
		System.out.println("A duração do jogo foi de |"+conclusao+"| horas.");
		
		scr.close();
	}

}
