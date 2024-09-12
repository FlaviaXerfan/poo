package slide3;

public class Assistente extends Funcionario1 {
	protected Double adicional;

	public Assistente(String nome, Double salario, Double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}
	public double aumentarSalario() {
		return super.aumentarSalario() + adicional;
	}

}
