package Capitulo2;
import java.util.Scanner;
public class atividade6_cap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Recebe as coordenadas superiores esquerdas do retângulo
        System.out.println("Digite as coordenadas x e y do canto superior esquerdo:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Recebe a largura e a altura do retângulo
        System.out.println("Digite a largura e a altura do retângulo:");
        int largura = scanner.nextInt();
        int altura = scanner.nextInt();

        // Calcula as coordenadas dos quatro vértices
        int x2 = x + largura;
        int y2 = y;
        int x3 = x;
        int y3 = y - altura;
        int x4 = x + largura;
        int y4 = y - altura;

        // Imprime as coordenadas dos vértices
        System.out.println("Os vértices do retângulo são:");
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");

        scanner.close();

	}

}
