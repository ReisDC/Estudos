package c1;

public class Sessao {

	 private String nomeFilme;
	 private String horario;
	 private Assento assentos;
	 private static final double PRECO = 25;
	 
	 public Sessao(String nomeFilme, String horario) {
		 this.nomeFilme = nomeFilme;
		 this.horario = horario;
		 this.assentos = new Assento();
	 }
	 public String getNomeFilme() {
		 return nomeFilme;
	 }
	 public String getHorario() {
		 return horario;
	 }
	 public void mostrarLugares() {
		 System.out.println(assentos.mostrarLugares());
	 }
	 public boolean venda(int fila, int assento) {
		 return assentos.venderAssento(fila, assento);
	 }
	 
	 @Override
	 public String toString() {
		 return "Filme: " +nomeFilme+ ", Horário: " +horario+ ", Preço: " +PRECO;
	 }
}
