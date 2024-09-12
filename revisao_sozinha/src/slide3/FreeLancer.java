package slide3;

public class FreeLancer extends Vendedor {

	private Integer diasTrabalhados;
	private double valorDia;

	public FreeLancer(String nome, String cpf, Integer diasTrabalhados, double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		return "diasTrabalhados: " + diasTrabalhados + "\nvalorDia: " + valorDia;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}

}
