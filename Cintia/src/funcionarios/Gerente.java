package funcionarios;

public class Gerente extends Funcionarios {
	public Gerente(String nome) {
		super(nome);
	}
	@Override
	public double calculaSalario() {
		 return getSalary() *2;
	}
}
