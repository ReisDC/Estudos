package lista_Exercicios_4;

import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
public class Ex5 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat *= i;
		}
		System.out.println(fat);
		scr.close();
	}

}
