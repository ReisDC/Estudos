package lista_Exercicios_4;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores
public class Ex6 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		
		for (int i=1; i<=n;i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		scr.close();
	}

}
