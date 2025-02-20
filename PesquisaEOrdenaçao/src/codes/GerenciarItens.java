package codes;

public class GerenciarItens {
	public static void main(String args[]) {
	// Criando um array de itens desordenado
	Item[] vetor = {
		new Item(75),
		new Item(34),
		new Item(22),
		new Item(55),
		new Item(2),
		new Item(60),
		new Item(89),
		new Item(15),
		new Item(90),
		};
	// Exibe o array antes da ordenação
	System.out.println("Array antes da ordenação: ");
	for(Item item : vetor) {
		System.out.print(item + " ");
	}
	System.out.println("\n");
	
	
	
	// Instanciando a classe de ordenação
	QuickSort quickSort = new QuickSort(vetor);
	quickSort.quickSort();
	
	System.out.println("Array QuickSort após ordenação: ");
	quickSort.printArray();
	System.out.println();
	
	HeapSort heapSort = new HeapSort(vetor);
	heapSort.heapSort();

	System.out.println("Array HeapSort após ordenação: ");
	heapSort.printArray();
	}
}
