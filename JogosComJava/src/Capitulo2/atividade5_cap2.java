package Capitulo2;
import java.util.Scanner;
public class atividade5_cap2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int opcao;
		System.out.println("1- Iniciar jogo.\n"
				+ "2- Restaurar último jogo.\n"
				+ "3- Configurar jogo.\n"
				+ "4- Sair.\n");
		opcao = scr.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu a opção de iniciar o jogo");
			break;
		case 2:
			System.out.println("Você escolheu a opção de restaurar o último save");
			break;
		case 3:
			System.out.println("Você escolheu a opção de configurações");
			break;
		case 4:
			System.out.println("Você escolheu a opção de sair. Volte logo!");
			break;
		default:
			System.out.println("Opção inexistente");
			break;
		}
		scr.close();
	}

}
