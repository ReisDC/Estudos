package concessionaria;

class Moto extends Veiculo {

	public Moto(String modelo, String marca, int ano) {
		super(modelo, marca, ano);
	}
	@Override
	public void exibirDetalhes() {
		System.out.println("Carro: " +marca+ "" +modelo+ "Ano: " +ano);
	}
	
	@Override
	public void abastecer(int litros) {
	System.out.println("Abastecendo o carro com " +litros+ "litros");	
	}
}
