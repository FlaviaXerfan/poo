package Enum;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServiço.LAVAGEM.getPorServiço();
	}

	@Override

	public Double trocarOleo() {
		return TipoServiço.OLEO.getPorServiço();
	}

	@Override
	public Double revisao() {
		return TipoServiço.REVISAO.getPorServiço();
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

}
