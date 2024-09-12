package revisao;

public class Assitente extends Funcionario {
	private String nivel;

	public Assitente(String nome, Double salario, String turno, String nivel) {
		super(nome, salario, turno);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Nivel: " + nivel + "\nDados: " + super.toString();
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void reajusteSalarial() {
		salario = salario * 1.18;

	}

}
