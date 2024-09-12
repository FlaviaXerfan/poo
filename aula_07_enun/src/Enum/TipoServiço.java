package Enum;

public enum TipoServiço {
	OLEO(100.), LAVAGEM(50.0), REVISAO(200.);

	private Double PorServiço;

	private TipoServiço(Double porServiço) {
		PorServiço = porServiço;
	}

	public Double getPorServiço() {
		return PorServiço;
	}

}
