package codes;

public class Item {
	
	private int chave;
	
	public Item(int chave) {
		this.chave = chave;
	}
	
	public int getChave() {
		return chave;
	}
	
	@Override
	public String toString() {
		return String.valueOf(chave);
	}

}
