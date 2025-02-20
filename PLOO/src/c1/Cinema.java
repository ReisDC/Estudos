package c1;
import java.util.Scanner;

public class Cinema {
	private Sessao[] sessoes;
	private Scanner scr;
	
	public Cinema() {
		sessoes = new Sessao[5];
		scr = new Scanner(System.in);
	}
	
	public void cadastrarSessoes() {
		for(int i = 0; i < sessoes.length; i++) {
			System.out.println("Cadastro da sessão " +(i + 1));
			System.out.println("Digite o nome do filme: ");
			String nomeFilme = scr.nextLine();
			System.out.println("Digite o horário da sessão: ");
			String horario = scr.nextLine();
			sessoes[i] = new Sessao(nomeFilme, horario);
		}
	}
	
	public void ticket() {
		System.out.println("Sessões disponíveis: ");
		for(int i = 0; i < sessoes.length; i++) {
			System.out.println((i + 1) +" - "+ sessoes[i]);
		}
		System.out.println("Escolha uma sessão: ");
		int sessaoEscolhida = scr.nextInt() - 1;
		
		Sessao sessao = sessoes[sessaoEscolhida];
		System.out.println("Lugares disponíveis: " +sessao.getNomeFilme()+ ":");
		sessao.mostrarLugares();
		
		System.out.println("Escolha a fila: ");
		int fila = scr.nextInt() - 1;
		
		System.out.println("Escolha o assento: ");
		int assento = scr.nextInt() - 1;
		
		boolean realizada = sessao.venda(fila, assento);
		if(realizada) {
			System.out.println("Ingresso vendido!\n"
							 + "Aproveite o filme!");
		}else {
			System.out.println("O assento escolhido já está ocupado.");
		}
	}
	public void menu() {
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("1 - Cadastrar sessões.\n"
							 + "2 - Vender ingresso.\n"
							 + "3 - Sair.\n"
							 + "Escolha uma opção: ");
			opcao = scr.nextInt();
			scr.nextLine();
			
			switch(opcao) {
			case 1: 
				cadastrarSessoes();
				break;
			case 2:
				ticket();
				break;
			case 3: 
				System.out.println("Saindo . . .");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
	
	
	public static void main(String args[]) {
		Cinema cinema = new Cinema();
		cinema.menu();
	}
}
