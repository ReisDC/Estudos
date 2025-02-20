package Capitulo2;
import java.util.Scanner;

public class atividade11_cap2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de x, y e z
        System.out.println("Digite os valores de x, y e z:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        // Cálculo do tamanho do vetor
        double tamanho = Math.sqrt(x*x + y*y + z*z);

        // Exibição do resultado
        System.out.println("O tamanho do vetor 3D é: " + tamanho);

        scanner.close();
}
}
