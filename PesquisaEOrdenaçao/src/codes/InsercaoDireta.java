package codes;

public class InsercaoDireta {
	
	private Item[] vetor;
	private int nElem;
	
	public InsercaoDireta(Item[] vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	public void insercaoDireta() {
		
	int i, j;
	Item temp;
	
	for(i = 1; i < this.nElem; i++) {
		temp = this.vetor[i];
		j = i - 1;
		
		while(j >= 0 && this.vetor[j].getChave() > temp.getChave()) {
			this.vetor[j + 1] = this.vetor[j];
			j--;
		}
		this.vetor[j + 1] = temp;
		}
	}
	
	public void printArray() {
        for (Item item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();
}
	}
