package codes;

public class ShakerSort {
	
	private Item[] vetor;
	private int nElem;
	
	public ShakerSort(Item[] vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	
	public void shakerSort() {
		int esq, dir, i, j;
		Item temp;
		esq = 1;
		dir = this.nElem - 1;
		j = dir;
		do {
			for(i = dir; i >= esq; i--) {
				if(this.vetor[i-1].getChave() > this.vetor[i].getChave()) {
					temp = this.vetor[i];
					this.vetor[i] = this.vetor[i-1];
					this.vetor[i-1] = temp;
					j = i;
				}
			}
			dir = j-1; 
		}while(esq <= dir);
	}
	
	public void printArray() {
		for(Item item : vetor) {
			System.out.println(item + "");
		}
		System.out.println();
	}
}
