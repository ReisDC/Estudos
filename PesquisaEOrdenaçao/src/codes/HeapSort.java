package codes;

public class HeapSort {

	private Item[] vetor;
	private int nElem;
	
	public HeapSort(Item[] vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	
	public void heapSort() {
		int dir = nElem - 1;
		int esq = (dir - 1) / 2;
		Item temp;
		
		// Constrói o heap
		while(esq >= 0) {
			refazHeap(esq--, nElem - 1);
		}
		
		// Realiza o HeapSort
		while(dir > 0) {
			// Troca o maior elemento (raiz) com ultímo elemento
			temp = this.vetor[0];
			this.vetor[0] = this.vetor[dir];
			this.vetor[dir] = temp;
			dir--;
			
			// Recontrói o heap
			refazHeap(0, dir);
		}
	}
	
	private void refazHeap(int esq, int dir) {
		int i = esq;
		int MaiorFolha = 2 * i + 1;// Filho esquerdo
		Item raiz = this.vetor[i];
		boolean heap = false;
		
		while((MaiorFolha <= dir) && (!heap)){
			// Verifica se o filho direito é maior que o esquerdo
			if(MaiorFolha < dir) {
				if(this.vetor[MaiorFolha].getChave() < this.vetor[MaiorFolha + 1].getChave()) {
					MaiorFolha++;// Filho direito
				}
			}
			
			// Se a raiz for menor que o o maior filho, troca
			if(raiz.getChave() < this.vetor[MaiorFolha].getChave()) {
				this.vetor[i] = this.vetor[MaiorFolha];
				i = MaiorFolha;
				MaiorFolha = 2 * i + 1;
			}else {
				heap = true;
			}
		}
		this.vetor[i] = raiz; // Coloca a raiz no local correto
	}
	
	public void printArray() {
		for(Item item : vetor) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
