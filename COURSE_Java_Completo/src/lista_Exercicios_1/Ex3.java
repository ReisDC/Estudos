package lista_Exercicios_1;
import java.util.Scanner;
public class Ex3 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
	
		int A, B, C, D, result;
	
		System.out.println("Insira o valor 1: ");
		A = scr.nextInt();
		System.out.println("Insira o valor 2: ");
		B = scr.nextInt();
		System.out.println("Insira o valor 3: ");
		C = scr.nextInt();
		System.out.println("Insira o valor 4: ");
		D = scr.nextInt();
		
		result = A*B - C*D;
		
		System.out.println("Resultado: " + result);
		scr.close();
	}

}
