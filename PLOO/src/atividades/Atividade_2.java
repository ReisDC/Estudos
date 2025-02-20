package atividades;
import java.util.ArrayList;
import java.util.LinkedList;
public class Atividade_2 {
	
	public static void main(String args[]) {
		ArrayList<Integer> lista1 = new ArrayList<>();
		
		Info.fillIn(lista1);
		
		LinkedList<Integer> Linked1 = new LinkedList<>(lista1);
		LinkedList<Integer> ListaInvertida = new LinkedList<>();
		
		for(int i = Linked1.size() - 1; i >= 0; i--) {
			ListaInvertida.add(Linked1.get(i));
		}
		
		System.out.println("Lista normal:    " + Linked1);
		System.out.println("Lista invertida: " + ListaInvertida);
	}
}