package exerciciosSlide03;

public class Veiculo {
	String placa;
	String tipo;
	Double valor;

	public double calcularIPVA() {
		if (tipo.equals("Flex") || tipo.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}

}
