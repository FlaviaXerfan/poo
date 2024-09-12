package slide3;

public class ImovelProprietario {
	protected String local;
	private double valorImovel;

	public ImovelProprietario(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "Local: " + local + "\nValor Imovel: R$ " + String.format("%.2f", valorImovel);
	}
	public double calcularImpostoVenda() {
		return valorImovel * 3.5/100;
	}
}
