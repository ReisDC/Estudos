package Aleatorio;
import java.util.Scanner;
public class Mistureba {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		/*
		 * Um menu com varias opcoes(calcular area de circulo, quadrado, retangulo. fazer operações aritmeticas
		 * simples. Contar alguma piada ou curiosidade[utilizar o random])
		 */
	      int escolha, opcao;	
	        do {
	            opcao = menu(scr); // Passando o objeto Scanner como argumento
	            switch (opcao) {
	                case '1':
	                    System.out.println("Escolha um formato");
	                    escolha = scr.nextInt();
	                    break;
	                case '2':
	                    // Implemente a lógica para a opção 2
	                    break;
	                case '3':
	                    // Implemente a lógica para a opção 3
	                    break;
	                case '4':
	                    // Implemente a lógica para a opção 4
	                    break;
	                case '5':
	                    break;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != '5');
	        scr.close(); // Fechar o Scanner após terminar de usar
	        System.exit(0);
	    }

	    public static int menu(Scanner scr) {
	        System.out.println("Escolha a opção que desejar: \n"+
	                 "1- Calcular área geométrica\n"+
	                 "2- Calcular operação aritmética simples\n"+
	                 "3- "+
	                 "4- "+
	                 "5- Sair");
	        return scr.next().charAt(0); // Retorna o primeiro caractere da entrada do usuário
	    } 
	}


