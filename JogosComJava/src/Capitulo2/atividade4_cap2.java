package Capitulo2;
import java.util.Scanner;

public class atividade4_cap2 {
	
	public static void main(String args[]) {
		//faça um programa que converta de celcius para fahrenheit
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de graus Celcius: ");
		double c = scr.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.printf("Seus %s graus Celcius dão %s graus Fahrenheit",c, f);
		
		
		
		
		
		scr.close();
	}
}
