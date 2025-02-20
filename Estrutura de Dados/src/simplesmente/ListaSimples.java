package simplesmente;
//import simplesmente.No;

import dados.Item;

public class ListaSimples {
	private No prim;
	private No ult;
	private int quantNos;
	
	public ListaSimples() { //Construtor da classe
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}
	public int getQuantNos() {
		return this.quantNos;
	}
	public No getPrim() {
		return this.prim;
	}
	public No getUlt() {
		return this.ult;
	}
	public void setQuantNos(int novoValor) {
		this.quantNos = novoValor;
	}
	public void setPrim(No novoNo) {
		this.prim = novoNo;
	}
	public void setUlt(No novoNo) {
		this.ult = novoNo;
	}
	
	
	public boolean eVazia () {
		return (this.prim == null);
	}
	
	
	public void inserirUltimo (Item elem) { //Insere um novo nó no final da lista ou, se a lista estiver vazia,
		No novoNo = new No (elem);          //insere o primeiro nó na lista.
		if (this.eVazia()) {
			this.prim = novoNo;
		}else {
			this.ult.setProx(novoNo);
		}
		this.ult = novoNo;
		this.quantNos++;
	}
	public No pesquisarNo (int chave) {
		No atual = this.prim;
		while ((atual != null) &&(atual.getInfo().getChave() != chave)) {
			atual = atual.getProx();
		}
		return atual;
	}
	public boolean removerNo (int chave) {  //Remove um determinado nó em qualquer posição na lista.
		No atual = this.prim;
		No ant = null;
		if (eVazia()) {
			return false;
		}else {
			while ((atual != null) && (atual.getInfo().getChave() != chave)) {
				ant = atual;
				atual = atual.getProx();
			}
			if (atual == null) {
				return false;
			}
			else {
				if (atual == this.prim) {
					if (this.prim == this.ult) {
						this.ult = null;
					}
					this.prim = this.prim.getProx();
				}else {
					if (atual == this.ult) {
						this.ult = ant;
					}
					ant.setProx(atual.getProx());
				}
				this.quantNos--;
				return true;
			}
		}
	}
	
	/*public boolean removerNó(int x) { // Outra forma de escrever o método para remover determinado Nó.
		if (this.eVazia()) {
			return false;
		}else {
			if (this.prim.getInfo().getChave() == x) {
				if (this.prim.getProx() == null) { // Se for único nó da lista.
						this.ult = null;
				}
				this.prim = this.prim.getProx(); // Remover o primeiro nó da lista.
			}else {
				No atual = this.prim;
				while ((atual.getProx() != null) && (atual.getProx().getInfo().getChave() != x)) {
					atual = atual.getProx();
				}
				if (atual.getProx() == null ) { //Não achou o valor na lista.
					return false;
				}else {
					if (atual.getProx() == this.ult) { //Se for o último nó.
						atual.setProx(null);;
						this.ult = atual;
					}else {
						atual.setProx(atual.getProx().getProx()); //Remove o nó no meio da lista.
					}
				}
			}
			this.quantNos--;
			return true;
		}
	}*/
	public String toString() { //Mostra o conteúdo da lista.
		String msg = "";
		No atual = this.prim;
		while (atual != null) {
			msg += atual.getInfo().getChave()+"\n";
			atual = atual.getProx();
		}
		return msg;
	}
}
