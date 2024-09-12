package Enum;

public enum Sanduiche {
	HOTDOG("Hot Dog", 10.00), HAMBURGUER("Hamburguer", 20.00), MISTO("Misto Quente", 8.50);

	private String tipoSanduiche;
	private double valor;

	private Sanduiche(String tipoSanduiche, double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public double getValor() {
		return valor;
	}

}
