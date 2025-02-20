package concessionaria;

abstract class Veiculo {
	String modelo;
	String marca;
	int ano;
	
	public Veiculo(String modelo, String marca, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	abstract void exibirDetalhes();
	
	public void ligarMotor() {
		System.out.println("Motor ligado");
	}
	
}
