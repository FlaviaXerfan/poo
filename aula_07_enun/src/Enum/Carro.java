package Enum;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServiço.LAVAGEM.getPorServiço();
	}

	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			return TipoServiço.OLEO.getPorServiço() - 50;
		} else {
			return TipoServiço.OLEO.getPorServiço();
		}
	}

	@Override
	public Double revisao() {
		if (dataConserto.getMonthValue() == 8) {
			return TipoServiço.REVISAO.getPorServiço() * 0.9;
		} else {
			return TipoServiço.REVISAO.getPorServiço();
		}

	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

}
