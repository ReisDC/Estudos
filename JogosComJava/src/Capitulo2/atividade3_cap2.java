package Capitulo2;
import java.util.Scanner;
public class atividade3_cap2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		//fazer um programa que solicite o raio de uma circunferencia e imprima sua area e perimetro
		
		double area, raio, perimetro, pi=3.14;
		
		System.out.println("Insira o raio da circunferência: ");
		raio=scr.nextDouble();
		
		area = pi * raio * raio;
		perimetro = 2 * pi * raio;
		
		System.out.println("A área desta circunferência é: "+area
				+"\nE seu perímetro é: "+perimetro);
		
		
		scr.close();
	}
}
