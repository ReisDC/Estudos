package atividades;
import java.util.LinkedList;

public class Fila {
	private LinkedList<Integer> fila;
	
	public Fila() {
		fila = new LinkedList<Integer>();
	}
	
	public boolean isEmpty() {
		if (fila.size() == 0) {
			return true;
		}
		return false;
	}
	
	public Integer head () {
		if (this.isEmpty())
			return null;
		return fila.getFirst();
	}
	public void enQueue (int num) {
		fila.addLast(num);
	}
	public Integer deQueue() {
		if (this.isEmpty())
			return null;
		return (fila.removeFirst());
	}
	public int size() {
		return fila.size();
	}
}
