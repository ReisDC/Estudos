package codes;
public class SelecaoDireta {

	public static void selecaoDireta(Item[] vetor, int nElem) {
		int i, j ,minimo;
		Item temp;
		
		for(i = 0; i < nElem - 1; i++) {
			minimo = i;
			
			for(j = i; j < nElem; j++) {
				if(vetor[j].getChave() < vetor[minimo].getChave()) {
					minimo = j;
				}
			}
			
			temp = vetor[minimo];
			vetor[minimo] = vetor[i];
			vetor[i] = temp;
		}
	}
	
	

}
