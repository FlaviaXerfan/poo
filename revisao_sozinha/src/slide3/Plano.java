package slide3;

public class Plano {
	protected String empresa;
	protected Double valorPago = 80.;
	protected Double valorISS = 5.;

	public Plano(String empresa, Double valorPago, Double valorISS) {
		super();
		this.empresa = empresa;
		this.valorPago = valorPago;
		this.valorISS = valorISS;
	}

	@Override
	public String toString() {
		return "empresa: " + empresa + "\nvalorPago: " + valorPago + "\nvalorISS: " + valorISS;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public Double getValorISS() {
		return valorISS;
	}

	public Double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorISS / 100;
	}
}
