package codes;

public class QuickSort {
	private Item[] vetor;
	private int nElem;
	
	public QuickSort(Item[] vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	// Inicio o QuickSort
	public void quickSort() {
		ordena(0, this.nElem - 1);// Chama o método de ordenação recursiva
	}
	// Método recursivo que realiza a oredenação
	private void ordena(int esq, int dir) {
		int pivo, i = esq, j = dir;
		Item temp;
		
		// Define o pivô como o valor do elemento no meio do intervalo 
		pivo = this.vetor[(esq + dir) / 2].getChave();
		
		// Realiza a partição
		do {
			// Move os ponteiros 'i' e 'j' até encontrar elementos fora de ordem
			while(this.vetor[i].getChave() < pivo) i++;
			while(this.vetor[j].getChave() > pivo) j--;
			
			// Troca os elementos quando necessario
			if(i <= j) {
				temp = this.vetor[i];
				this.vetor[i] = this.vetor[j];
				this.vetor[j] = temp;
				i++;
				j--;
			}
		}while(i <= j);
		
		// Recurssivamente ordena as subpartições
		if(esq < j) {
			ordena(esq, j);// Lado esquerdo
		}
		if(i < dir) {
			ordena(i, dir);// Lado direito
		}
	}
	public void printArray() {
		for(Item item : vetor) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
