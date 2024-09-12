package slide3;

public class Funcionario1 {
	protected String nome, cpf;
	protected Double salario;
	protected String turno;

	public Funcionario1(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncpf: " + cpf + "\nsalario: " + salario + "\nturno: " + turno;
	}

	public double aumentarSalario() {
		return salario * 1.02;
	}
	
	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

}
