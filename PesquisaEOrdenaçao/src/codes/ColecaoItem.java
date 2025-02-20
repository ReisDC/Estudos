package codes;

public class ColecaoItem {
	
	private Item[] vetor;
	private int nElem;
	
	
	public ColecaoItem(int tamanho) {
		this.vetor = new Item[tamanho];
		this.nElem = 0;
	}
	
	public void adicionarItem(Item item) {
		if(nElem < vetor.length) {
			vetor[nElem] = item;
			nElem++;
		}else {
			System.out.println("Vetor cheio!");
		}
	}
	
	public Item[] getItens() {
		return vetor;
	}
	
	public int getNumeroElementos() {
		return nElem;
	}
	
	public void imprimirItens() {
		for(int i = 0; i < nElem; i++ ) {
			System.out.println(vetor[i]);
		}
	}
}

