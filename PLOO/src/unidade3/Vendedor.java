package unidade3;

public class Vendedor {
	private String nome;
	private double salarioBase = 1500.00;
	private int tempoServico; // meses
	private char categoria;
	private double totalVendas;
	
	public Vendedor(String nome, int tempoServico, double totalVendas) {
		this.nome = nome;
		this.tempoServico = tempoServico;
		this.totalVendas = totalVendas;
		setCategoria();
	}
	
	public String getNome() {
		return nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	public char getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(tempoServico > 60) {
			this.categoria = 'A';
		}else if (tempoServico >= 30) {
			this.categoria = 'B';
		}else {
			this.categoria = 'C';
		}
	}
	
	public double getTotalVendas() {
		return totalVendas;
	}
	public double comissao() {
		if(totalVendas > 20000) {
			return totalVendas * 0.20;
		}else if(totalVendas >= 10000) {
			return totalVendas * 0.15;
		}else {
			return totalVendas * 0.05;
		}
	}
	
	public double gratificacao() {
		if(categoria == 'A') {
			return salarioBase * 0.15;
		}else if(categoria == 'B') {
			return salarioBase * 0.075;
		}else {
			return 0;
		}
	}
	public double salario() {
		return salarioBase + comissao() + gratificacao();
	}
	
	@Override
	public String toString() {
		return "Vendedor [Nome: " +nome+ ", Categoria: " +categoria+ ", Tempo de Serviço: " +tempoServico+ " meses" + 
				", Total de Vendas: R$" +totalVendas+ ", Salário: R$" +salario()+ "]";
	}
}
