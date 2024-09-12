package revisao;

public class AssitenteFinanceiro extends Assitente {
	private String curso;

	public AssitenteFinanceiro(String nome, Double salario, String turno, String nivel, String curso) {
		super(nome, salario, turno, nivel);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "AssitenteFinanceiro [curso=" + curso + ", toString()=" + super.toString() + "]";
	}

}
