package funcionarios;

public class Assistente extends Funcionarios {
	public Assistente(String nome) {
		super(nome);
	}
	@Override
	public double calculaSalario() {
		return getSalary();
	}

}
