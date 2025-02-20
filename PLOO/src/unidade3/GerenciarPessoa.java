package unidade3;

public class GerenciarPessoa {
	public static void main(String args[]) {
		Pessoa p1 = new Pessoa ("João Silva", "123.456.789-00");
		System.out.println("Total de pessoas criadas: " +Pessoa.getQuant());

		Pessoa p2 = new Pessoa ("Fabíola Alves", "669.420.538-69");
		System.out.println("Total de pessoas criadas: " +Pessoa.getQuant());
		
		Pessoa p3 = new Pessoa ("Ricardo Azevedo", "111.222.333-70");
		System.out.println("Total de pessoas criadas: " +Pessoa.getQuant());
		
	}

}
 