package lista_Exercicios_1;
import java.util.Scanner;
public class Ex6 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor de A: ");
		A = scr.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = scr.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = scr.nextDouble();
		
		triangulo = A*C /2;
		circulo = 3.14159 *(C *C);
		trapezio = (A+B)*C/2;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("Triangulo: %.3f%n"
						+ "Circulo: %.3f%n"
						+ "Trapezio: %.3f%n"
						+ "Quadrado: %.3f%n"
						+ "Retangulo: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
						 
		
		scr.close();
	}

}
