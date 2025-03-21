package Lista_Exercicios_3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = scr.nextInt();
		
		
		while(senha != 2002) {
			System.out.println("Senha inválida. Digite novamente!");
			senha = scr.nextInt();			
			
		}
		System.out.println("Acesso permitido!");
		
		scr.close();
	}
}
