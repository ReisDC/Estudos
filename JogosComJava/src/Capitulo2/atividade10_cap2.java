package Capitulo2;
import java.util.Scanner;

public class atividade10_cap2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leitura dos dados do usuário
	        System.out.println("Digite o instante inicial do frame em segundos:");
	        double instanteInicial = scanner.nextDouble();

	        System.out.println("Digite o instante final do frame em segundos:");
	        double instanteFinal = scanner.nextDouble();

	        System.out.println("Digite a velocidade inicial do corpo em queda livre em m/s:");
	        double velocidadeInicial = scanner.nextDouble();

	        System.out.println("Digite a altura inicial do corpo em relação ao solo em centímetros:");
	        double alturaInicialCm = scanner.nextDouble();

	        // Conversão de altura inicial para metros
	        double alturaInicialM = alturaInicialCm / 100.0;

	        // Constante da gravidade
	        final double GRAVIDADE = 9.8;

	        // Cálculo do tempo transcorrido no frame
	        double tempoTranscorrido = instanteFinal - instanteInicial;

	        // Cálculo da nova altura do corpo para o próximo frame
	        double novaAlturaM = alturaInicialM + (velocidadeInicial * tempoTranscorrido) - (0.5 * GRAVIDADE * tempoTranscorrido * tempoTranscorrido);

	        // Convertendo a nova altura de metros para centímetros
	        double novaAlturaCm = novaAlturaM * 100.0;

	        // Exibição do resultado
	        System.out.println("A nova altura do corpo em relação ao solo para o próximo frame é: " + novaAlturaCm + " cm");

	        scanner.close();
	    
	}

}
