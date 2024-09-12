package Enum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo: " + modelo + "\nValor Cobrado: R$ " + String.format("%.2f", valorCobrado) + "\nData Conserto: "
				+ dataConserto.format(formatter) + "\n" + proprietario;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

}
