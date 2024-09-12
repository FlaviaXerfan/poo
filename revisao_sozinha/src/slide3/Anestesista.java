package slide3;

public class Anestesista extends Medico1 {

	private String tipoAnestesista;

	public Anestesista(String empresa, Double valorPago, Double valorISS, String nome, String crm,
			String tipoAnestesista) {
		super(empresa, valorPago, valorISS, nome, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	@Override
	public String toString() {
		return "tipoAnestesista: " + tipoAnestesista;
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 1000.;
	}
}
