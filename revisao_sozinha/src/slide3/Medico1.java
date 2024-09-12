package slide3;

public class Medico1 extends Plano {
	private String nome;
	private String crm;

	public Medico1(String empresa, Double valorPago, Double valorISS, String nome, String crm) {
		super(empresa, valorPago, valorISS);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncrm: " + crm;
	}

	public String getNome() {
		return nome;
	}

	public String getCrm() {
		return crm;
	}

	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10 + 1000.;
	}

}
