package unidade3;
import java.util.Scanner;

public class Calculadora {

	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int opcao;
		do {
		System.out.println("Menu de conversão de medidas: "
		+ "1. Converter Km para Milha\n "
		+ "2. Converter Milha para Km\n "
		+ "3. Converter Pés para Cm\n "
		+ "4. Converter Cm para Pés\n "
		+ "5. Converter Polegadas para Cm\n "
		+ "6. Converter Cm para Polegadas\n "
		+ "7. Sair\n "
		+ "Escolha uma opção:\n ");
		opcao = scr.nextInt();
		switch (opcao) {
		case 1:
		System.out.println("Digite o valor em km: ");
		double km = scr.nextDouble();
		System.out.println(km + " km é igual a " + Conversoes.kmToMilha(km) + "milhas.");
		break;
		case 2:
		System.out.println("Digite o valor em Milhas: ");
		double milha = scr.nextDouble();
		System.out.println(milha + " milhas é igual a " + Conversoes.milhaToKm(milha) + "km.");
		break;
		case 3:
		System.out.println("Digite o valor em Pé: ");
		double pe = scr.nextDouble();
		System.out.println(pe + " pés é igual a " + Conversoes.peToCm(pe) + "cm.");
		break;
		case 4:
		System.out.println("Digite o valor em Cm: ");
		double cm = scr.nextDouble();
		System.out.println(cm + " cm é igual a " + Conversoes.cmToPe(cm) + "pés.");
		break;
		case 5:
		System.out.println("Digite o valor em Polegadas: ");
		double pol = scr.nextDouble();
		System.out.println(pol + " polegadas é igual a " + Conversoes.cmToPol(pol) + "cm.");
		break;
		case 6:
		System.out.println("Digite o valor em Cm: ");
		cm = scr.nextDouble();
		System.out.println(cm + " cm é igual a " + Conversoes.polToCm(cm) + "polegadas.");
		break;
		case 7:
		System.out.println("Saindo.");
		break;
		default:
		System.out.println("Opção inválida.");
		break;
		}
		System.out.println();
		}while(opcao != 7);
		scr.close();
		}
}
