package funcionarios;

public class Vendedor extends Funcionarios {
	private double comissao;
	
	public Vendedor(String nome, double comissao) {
		super(nome);
		this.comissao = comissao;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calculaSalario() {
		return getSalary() + getComissao();
	}

}
