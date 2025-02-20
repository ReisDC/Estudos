package trabalho1;

public class Ordenacao {
	
	// Inserção Direta
	public static Info insercaoDireta(int[] vetor) {
		int comparacoes = 0;
		int movimentos = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			int chave = vetor[i];
			int j = i - 1;
			comparacoes++;
			
			while(j >= 0 && vetor[j] > chave) {
				comparacoes++;
				vetor[j + 1] = vetor[j];
				movimentos++;
				j--;
		}
			vetor[j + 1] = chave;
			movimentos++;
	}
		return new Info(comparacoes, movimentos);
	}
	
	// Seleção Direta
	public static Info selecaoDireta(int[] vetor) {
		int comparacoes = 0;
		int movimentos = 0;
		
		for(int i = 0; i < vetor.length - 1; i++) {
			int minimo = i;
			
			for(int j = i + 1; j < vetor.length; j++) {
				comparacoes++;
					if(vetor[j] < vetor[minimo]) {
					minimo = j;
					}	
				}
				if(minimo != i) {
					int temp = vetor[i];
					vetor[i] = vetor[minimo];
					vetor[minimo] = temp;
					movimentos ++;
				}
			}
		return new Info(comparacoes, movimentos);
	}
	
	// Bubble Sort
	public static Info bubbleSort(int[] vetor) {
		int comparacoes = 0;
		int movimentos = 0;
		boolean troca;
		
		for(int i = 0; i < vetor.length - 1; i++) {
			troca = false;
			for(int j = i; j < vetor.length - 1; j++) {
				comparacoes++;
				if(vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					movimentos ++;
					troca = true;
				}
			}
			if(!troca) break;
		}
		return new Info(comparacoes, movimentos);
	}
	
	// Shaker Sort
	public static Info shakerSort(int[] array) {
		int comparacoes = 0;
		int movimentos = 0;
		boolean troca = true;
		int inicio = 0;
		int fim = array.length - 1;
		
		while(troca) {
			troca = false;
			
			
			for(int i = inicio; i < fim; i++) {
				comparacoes++;
				if(array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					movimentos ++;
					troca = true;
				}
			}
			if(troca) {
				break;
			}
			fim--;
			troca = false;
			for (int i = fim; i > inicio; i--) {
	            comparacoes++;
	            if (array[i] < array[i - 1]) {
	                // Troca os elementos
	                int temp = array[i];
	                array[i] = array[i - 1];
	                array[i - 1] = temp;
	                movimentos++;
	                troca = true;
			}
		}
			inicio++;
		}
		return new Info (comparacoes, movimentos);
		
	}
	
	// Shell Sort
	public static Info shellSort(int[] array) {
		int comparacoes = 0;
		int movimentos = 0;
		int n = array.length;
		
		for(int gap = n / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < n; i++) {
				int temp = array[i];
				int j;

				for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
	                comparacoes++;
	                array[j] = array[j - gap];
	                movimentos++;
				}
				array[j] = temp;
				movimentos++;
			}
		}
		return new Info(comparacoes, movimentos);
	}
	
	// Heap Sort
	public static Info heapSort(int[] array) {
		int comparacoes = 0;
		int movimentos = 0;
		int n = array.length;
		
		for(int i = n / 2 - 1; i >= 0; i--) {
			Info info = folha(array, n, i);
			comparacoes += info.comparacoes;
			movimentos += info.movimentos;
		}
		for(int i = n - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			movimentos ++;
			
			Info info = folha(array, i, 0);
			comparacoes += info.comparacoes;
	        movimentos += info.movimentos;
		}
		return new Info(comparacoes, movimentos);
	}
	//Folha
	public static Info folha(int[] array, int n, int i) {
		int comparacoes = 0;
		int movimentos = 0;
		
		int maior = i;
		int esq = 2 * i + 1;
		int dir = 2 * i + 2;
		
		if (esq < n) {
	        comparacoes++;
	        if (array[esq] > array[maior]) {
	            maior = esq;
		}
	}
		if(dir < n && array[dir] > array[maior]) {
			maior = dir;
			comparacoes++;
		}
		if (dir < n) {
	        comparacoes++;
	        if (array[dir] > array[maior]) {
	            maior = dir;
	        }
		}
	if (maior != i) {
        int troca = array[i];
        array[i] = array[maior];
        array[maior] = troca;
        movimentos++;

        // Recursivamente heapify a subárvore afetada
        Info info = folha(array, n, maior);
        comparacoes += info.comparacoes;
        movimentos += info.movimentos;
    }

    return new Info(comparacoes, movimentos);
}
	// Quick Sort
	public static Info quickSort(int[] array) {
		return quickSortRecursive(array, 0, array.length - 1);
	}
	private static Info quickSortRecursive(int[] array, int inicio, int fim) {
		int comparacoes = 0;
		int movimentos = 0;
	
		if(inicio < fim) {
			PartResult partResult = part(array, inicio, fim);
			int pivo = partResult.pivo;
			comparacoes += partResult.comparacoes;
			movimentos += partResult.movimentos;
			
			Info esqInfo = quickSortRecursive(array, inicio, pivo - 1);
			Info dirInfo = quickSortRecursive(array, pivo + 1, fim);
			
			comparacoes += esqInfo.comparacoes + dirInfo.comparacoes;
			movimentos += esqInfo.movimentos + dirInfo.movimentos;
		}
		return new Info(comparacoes, movimentos);
	}
	private static PartResult part(int[] array, int inicio, int fim) {
		int pivo = array[fim];
		int i = inicio - 1;
		int comparacoes = 0;
		int movimentos = 0;
		
		for(int j = inicio; j < fim; j++) {
			comparacoes++;
			if(array[j] <= pivo) {
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				movimentos++;
			}
		}
				int temp = array[i + 1];
				array[i + 1] = array[fim];
				array[fim] = temp;
				movimentos++;
				
		return new PartResult(i + 1, comparacoes, movimentos);
	}		
	static class PartResult{
		int pivo;
		int comparacoes;
		int movimentos;
		
		public PartResult(int pivo, int comparacoes, int movimentos) {
			this.pivo = pivo;
			this.comparacoes = comparacoes;
			this.movimentos = movimentos;
		}
	}
}