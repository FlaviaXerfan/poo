package Exercicio;

public class Assitente extends Funcionario {
	private Double adicional;

	public Assitente(String nome, Double salario, Double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	public double aumentarSalario() {
		return super.aumentarSalario() + adicional;
	}

}
