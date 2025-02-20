package lista_Exercicios_1;
import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		System.out.println("Insira o raio: ");
		raio = scr.nextDouble();
		area = pi * (raio*raio);
		
		System.out.printf("Area = %.4f%n ", area);
		
		scr.close();
  }
}
