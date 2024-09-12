package vetor;

public class Funcionario {
	private String nome;
	private String cargo;
	private Double salario;

	public Funcionario(String nome, String cargo, Double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncargo: " + cargo + "\nsalario: " + salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double abonoSalarial(double abono) {
		return this.salario += abono;

	}
}
