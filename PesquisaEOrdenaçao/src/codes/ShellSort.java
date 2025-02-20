package codes;

public class ShellSort {
	
	private Item[] vetor;
	private int nElem;
	
	public ShellSort(Item[]vetor) {
		this.vetor = vetor;
		this.nElem = vetor.length;
	}
	
	//Realizar o ShellSort
	public void shellSort() {
		int i, j, h;
		Item temp;
		h = 1;
		
		// Inicializamos o intervalo "h" de forma crescente utilizando a formula de knuth: h = 3*h + 1
		do {
			h = 3 * h + 1;
		}while(h < this.nElem);
		
		// Enquanto o intervalo 'h' for  maior ou igual a 1
		do {
			h = h / 3;
			
			// Para cada elemento no array a partir da posição 'h'
			for(i = h; i < this.nElem; i++) {
				temp = this.vetor[i];
				j = i;
				
				// Realiza a inserção direta entre elementos que estão 'h' posições distantes
				while(j >= h && this.vetor[j - h].getChave() > temp.getChave()) {
					this.vetor[j] = this.vetor[j - h]; // Move o elemento para frente
					j -= h;
				}
				this.vetor[j] = temp; // Insere o elemento na posição correta
			}
		} while(h > 1); // Continua até que 'h' seja reduzido a 1
	}
	
	// Método para imprimir o array
	public void printArray() {
		for(Item item : vetor) {
			System.out.println(item + "");
		}
		System.out.println();
	}

}
