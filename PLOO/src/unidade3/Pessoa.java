package unidade3;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private static int quant = 0;
	
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		quant++;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return cpf;
	}
	
	public static int getQuant() {
		return quant;
	}

}
