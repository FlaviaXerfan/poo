package slide3;

public class Veiculo {
	public String placa;
	public String tipo;
	public Double valor;

	public Veiculo(String placa, String tipo, Double valor) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "placa: " + placa + "\ntipo: " + tipo + "\nvalor: " + valor;
	}

	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double calcularIPVA() {
		if (tipo == ("Flex")) {
			return valor = valor * 0.04;

		} else {
			return valor = valor * 0.015;

		}
	}

}
