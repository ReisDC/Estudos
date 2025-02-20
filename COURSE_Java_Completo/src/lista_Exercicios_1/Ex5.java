package lista_Exercicios_1;
import java.util.Scanner;
public class Ex5 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int p1, p2, n1, n2;
		double valor1, valor2, pagar;
		
		System.out.println("Digite o numero da peça 1: ");
		p1 = scr.nextInt();
		System.out.println("Digite a quantidade de peças 1: ");
		n1 = scr.nextInt();
		System.out.println("Digite o valor de cada peça 1: ");
		valor1 = scr.nextDouble();
		System.out.println("Digite o numero da peça 2: ");
		p2 = scr.nextInt();		
		System.out.println("Digite a quantidade de peças 2: ");
		n2 = scr.nextInt();		
		System.out.println("Digite o valor de cada peça 2: ");
		valor2 = scr.nextDouble();
		
		pagar = n1*valor1 + n2*valor2;
		System.out.println("Valor a pagar = " + pagar);
		
		scr.close();
	}

}
