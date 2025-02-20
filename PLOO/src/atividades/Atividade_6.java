package atividades;
import java.util.ArrayList;
import java.util.HashSet;

public class Atividade_6 {
	
	public static void main(String args[]) {
		ArrayList<Integer> filaLista = new ArrayList<>();
		
		Info.fillIn(filaLista);
		
		System.out.println("Lista original:      " + filaLista);
		
		ArrayList<Integer> listaDiferente = removerDuplicados(filaLista);
		System.out.println("Lista sem repetidos: " + listaDiferente);
	}
	public static ArrayList<Integer> removerDuplicados(ArrayList<Integer> lista){
		HashSet<Integer> conjunto = new HashSet<>();
		ArrayList<Integer> listaDiferente = new ArrayList<>();
		
		for(int num : lista) {
			if(!conjunto.contains(num)) {
				conjunto.add(num);
				listaDiferente.add(num);
			}
		}
		return listaDiferente;
	}

}
