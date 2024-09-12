package Exercicio;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, Double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public double calcularIR() {
		return this.rendimentos * 0.12;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return this.nome + "Rendimentos: " + this.rendimentos + "CPF: " + this.cpf;
	}

}
