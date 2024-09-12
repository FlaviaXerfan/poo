package interfaces;

public class Empresa implements Tributos {
	private String RazaoSocial;
	private Double rendimentos;

	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		RazaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Empresa [RazaoSocial=" + RazaoSocial + ", rendimentos=" + rendimentos + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIR() {
		return rendimentos * IRPESSOAJURIDICA;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * ICMS;
	}

}
