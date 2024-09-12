package aula;

public class Medico {
	private int crm;
	private String nome;
	private Double salario;
	private Double valorConsulta;
	private static int totalMedicos;

	public Medico(int crm, String nome, Double salario, Double valorConsulta, int totalMedicos) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Medico.totalMedicos = totalMedicos +1;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", salario=" + salario + ", valorConsulta=" + valorConsulta
				+ ", totalMedicos=" + totalMedicos + "]";
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public static int getTotalMedicos() {
		return totalMedicos;
	}

	public static int setTotalMedicos(int totalMedicos) {
		return Medico.totalMedicos = totalMedicos +1;
	}

	public void pagamentoDinheiro(double valorConsulta) {
		salario = salario + valorConsulta;
	}

	public void pagamentoPlano(double valorConsulta) {
		salario = salario + valorConsulta * 0.7;

	}
}
