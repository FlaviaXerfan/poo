package slide3;

public class Funcionario {
	public String nome;
	public Double salario;

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double calcularInss() {
		return salario = salario * 0.11;
	}

	public double calcularValeTransporte() {
		return salario = salario * 0.6;
	}

	public double calcularSalarioLiquido() {
		return salario = salario - calcularInss() - calcularValeTransporte();
	}
}
