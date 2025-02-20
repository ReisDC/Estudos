package simplesmente;
import dados.Item;

public class No {
	private Item info; //A declaração do tipo Item está no capítulo 1.
	private No prox;
	
	//A variável elem contém os dados que serão armazenados
	public No(Item elem) {
		this.info = elem;
		this.prox = null; // Esta linha é opcional, pois prox é automaticamente definido como null
	}

	public Item getInfo () {
		return this.info;
	}
	public void setInfo(Item elem) {
		this.info = elem;
	}
	public No getProx() {
		return this.prox;
	}
	public void setProx(No novoNo) {
		this.prox = novoNo;
	}
}
 
