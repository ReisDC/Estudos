package funcionarios;

public abstract class Funcionarios {
	private String name;
	protected static double salary = 1400;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Funcionarios.salary = salary;
	}

	public abstract double calculaSalario();
	
	public Funcionarios(String name) {
		this.name = name;
	}
}
