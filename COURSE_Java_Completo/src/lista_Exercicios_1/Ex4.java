package lista_Exercicios_1;
import java.util.Scanner;
public class Ex4 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int Funcionario, HoraT;
		double valor, salario;
		
		System.out.println("Digite o numero do funcionario: ");
		Funcionario = scr.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		HoraT = scr.nextInt();
		System.out.println("Digite o valor que este funcionario recebe por hora: ");
		valor = scr.nextDouble();
		
		salario = HoraT * valor;
		
		System.out.printf("Funcionario =%s \n"
						 + "Salario = R$%s ", Funcionario, salario);
		
		scr.close();
	}

}
