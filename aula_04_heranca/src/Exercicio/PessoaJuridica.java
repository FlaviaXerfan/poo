package Exercicio;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;

	public PessoaJuridica(String nome, Double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public double calcularIR() {
		return this.rendimentos * 0.15;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return this.nome + "Rendimentos: " + this.rendimentos + "CNPJ: " + this.cnpj;
	}

}
