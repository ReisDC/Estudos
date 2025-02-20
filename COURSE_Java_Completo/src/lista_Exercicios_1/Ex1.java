package lista_Exercicios_1;
import java.util.Scanner;

public class Ex1 {
	public static void main (String args[]){
		Scanner scr = new Scanner(System.in);
		System.out.println("Digite o valor 1");
		int A = scr.nextInt();
		System.out.println("Digite o valor 2");
		int B = scr.nextInt();
		
		int soma = A + B;
		
		System.out.println("soma = " + soma);
		
		scr.close();
	}
}
