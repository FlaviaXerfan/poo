package Enum;

public enum Bebida {
	REFRIGERANTE("refrigerante", 7.00), SUCO ("Suco", 8.50), AGUA ("Agua Mineral", 5.00);
	
	private String tipoBebida;
	private double valor;
	
	private Bebida(String tipoBebida, double valor) {
		this.tipoBebida = tipoBebida;
		this.valor = valor;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public double getValor() {
		return valor;
	}
	
	
		
	

}
