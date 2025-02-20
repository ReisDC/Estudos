package concessionaria;

public abstract class Caminhao extends Veiculo {
	
	public Caminhao(String modelo, String marca, int ano) {
		super(modelo, marca, ano);
	}
	void abastecer(int litros) {
		System.out.println("Abastecendo o caminhão com [litros] litros");
	}

}
