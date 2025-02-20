package Gerador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Gerador {
//	Lista com os posiveis nomes
	private static final String[] PRIMEIROS_NOMES = {"João", "Luis", "Margarida", "Nicole", "Ricardo", "Maria",
			"Lucas", "Ana", "Caio", "Felipe"};
	private static final String[] SOBRENOMES = {"Nascimento", "Mohamed", "Ribeiro", "de Jesus", "Telles", "Minecraft", 
			"Rocha", "Tanaka", "Esquilo", "João"};
	private static final String[] ULTIMO_NOME = {"Marques", "Lima", "Rocha", "João", "DoisPierre", "Almeida",
			"Dark Souls", "da Silva", "Burrito", "Nicolini"};
	private static final char[] SEXOS = {'M', 'F'}; 
	private static final char[] ESTADOS_CIVIS = {'S', 'V', 'C', 'D'};
	
//	Metodo para gerar um CPF valido
	public static String gerarCPF() {
		Random random = new Random();
		int n1 = random.nextInt(10);
		int n2 = random.nextInt(10);
		int n3 = random.nextInt(10);
		int n4 = random.nextInt(10);
		int n5 = random.nextInt(10);
		int n6 = random.nextInt(10);
		int n7 = random.nextInt(10);
		int n8 = random.nextInt(10);
		int n9 = random.nextInt(10);
		//Calculando os digitos verificadores
		int d1 = 11 - (n1*10 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2) % 11;
		d1 = d1 >= 10 ? 0 : d1;
		int d2 = 11 - (n1*11 + n2*10 + n3*9 + n4*8 + n5*7 + n6*6 + n7*5 + n8*4 + n9*3 + d1*2) % 11;
		d2 = d2 >=10 ? 0 :d2;
		
		return String.format("%d%d%d.%d%d%d.%d%d%d-%d%d", n1, n2, n3, n4, n5, n6, n7, n8, n9, d1, d2);
	}
	
//	Metodo para gerar um nome completo aleatorio
	public static String gerarNomeCompleto() {
		Random random = new Random();
		String primeiroNome = PRIMEIROS_NOMES[random.nextInt(PRIMEIROS_NOMES.length)];
		String sobrenome = SOBRENOMES[random.nextInt(SOBRENOMES.length)];
		String ultimoNome = ULTIMO_NOME[random.nextInt(ULTIMO_NOME.length)];
		return primeiroNome + " " + sobrenome + " " + ultimoNome;
	}
	
//	Metodo para gerar data de nascimento
	public static String gerarDataNascimento() {
		Random random = new Random();
		int dia = random.nextInt(28) + 1;
		int mes = random.nextInt(12) + 1;
		int ano = random.nextInt(50) + 1950;
		
		LocalDate data = LocalDate.of(ano, mes, dia);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(formatter);
	}
	
//	Metodo para gerar sexo aleatorio
	public static char gerarSexo() {
		Random random = new Random();
		return SEXOS[random.nextInt(SEXOS.length)];
	}
	
//	Metodo para gerar estado civil aleatorio
	public static char gerarEstadoCivil() {
		Random random = new Random();
		return ESTADOS_CIVIS[random.nextInt(ESTADOS_CIVIS.length)];
	}
	
	public static void main(String Args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Quantos nomes deseja gerar? ");
		int quantidade = scr.nextInt();
		
		List<String> nomesGerados = new ArrayList<>();
		
		try (PrintWriter writer = new PrintWriter(new FileWriter("dados_cadastrais.txt"))){
			for(int i = 0; i < quantidade; i++) {
			String nomeCompleto;
			do {
				nomeCompleto = gerarNomeCompleto();
			} while (nomesGerados.contains(nomeCompleto));
			
			String cpf = gerarCPF();
			String dataNascimento = gerarDataNascimento();
			char sexo = gerarSexo();
			char estadoCivil = gerarEstadoCivil(); 
			
			
			nomesGerados.add(nomeCompleto);
			
			int identificador = i + 1;
			
			
//	Escrever no arquivo
			writer.println(identificador + "; " + nomeCompleto + "; "+ cpf + "; " + dataNascimento + "; " + sexo + "; " + estadoCivil);
		}
		System.out.println("Dados salvos no arquivo!");
	} catch (IOException e) {
		System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
	}
	
	scr.close();
	}
}

