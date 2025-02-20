package atividades;
import java.util.TreeSet;
import java.util.ArrayList;

	public class Atividade_1 {
		public static void main(String args[]) {
				
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	ArrayList<Integer> list3 = new ArrayList<>();
	TreeSet<Integer> tSet;
	Info.fillIn(list1);
	Info.fillIn(list2);
	
	tSet = new TreeSet<>(list1);
	tSet.addAll(list2);
	
	list3 = new ArrayList<>(tSet);
	
	System.out.println("Lista 1: " + list1 + "\n" + "Lista 2: " + list2 + "\n");
	System.out.println("Lista 3: " + list3);
	}
}
