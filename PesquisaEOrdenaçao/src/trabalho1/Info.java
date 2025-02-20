package trabalho1;

public class Info {
	int comparacoes;
	int movimentos;
	
	public Info(int comparacoes, int movimentos) {
		this.comparacoes = comparacoes;
		this.movimentos = movimentos;
	}
	public int getComparacoes() {
		return comparacoes;
	}
	public int getMovimentos() {
		return movimentos;
	}
	
	
	@Override
	public String toString() {
		return "Comparações: " +comparacoes+ ", Movimentações: " +movimentos;
	}

}
