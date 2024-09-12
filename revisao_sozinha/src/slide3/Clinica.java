package slide3;

public class Clinica extends Plano {
	private String nome;
	private String cnpj;

	public Clinica(String empresa, Double valorPago, Double valorISS, String nome, String cnpj) {
		super(empresa, valorPago, valorISS);
		this.nome = nome;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncnpj: " + cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

}
