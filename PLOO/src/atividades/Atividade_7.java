package atividades;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Stack;

public class Atividade_7 {
	public static void main(String args[]) {
	ArrayList<Integer> pilhaLista = new ArrayList<>();	
	
	Info.fillIn(pilhaLista);
	
	System.out.println("Lista original:  " + pilhaLista);
	
	Stack<Integer> pilhaDiferente = removerDuplicados(pilhaLista);
	
	System.out.println("Lista Diferente: " + pilhaDiferente);
	}
	
	public static Stack<Integer> removerDuplicados(ArrayList<Integer> pilhaLista){
		HashSet<Integer> conjunto = new HashSet<>();
		Stack<Integer> pilhaDiferente = new Stack<>();
		
		for(int num : pilhaLista) {
			if(!conjunto.contains(num)) {
				conjunto.add(num);
				pilhaDiferente.push(num);
			}
		}
		return pilhaDiferente;
	}
}
