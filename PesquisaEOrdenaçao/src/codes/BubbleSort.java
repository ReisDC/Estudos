package codes;

public class BubbleSort {
	
	private Item[] vetor;
	private int nElem;
	
	public BubbleSort(Item[] vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	
	public void bubbleSort() {
		int n, i, j;
		Item temp;
		n = this.nElem - 1;
		do {
			i = 0;
			for(j = 0; j < n; j++) {
				if(this.vetor[j].getChave() > this.vetor[j+1].getChave()) {
					temp = this.vetor[j];
					this.vetor[j] = this.vetor[j+1];
					this.vetor[j+1] = temp;
					i = j;
				}
		}
			n = i;
		}while(n >= 1);
	}
	public void printArray() {
        for (Item item : vetor) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
