package Exercicio;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected Double salario;
	protected String turno;

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario: " + nome + "\nSalario: " + salario;
	}

	public double aumentarSalario() {
		return salario = salario * 1.02;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
