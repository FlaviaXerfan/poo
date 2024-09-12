package slide3;

public class Medico {
	public String crm;
	public String nome;
	public Double salario;
	public Double valorConsulta;
	private static int totalMedicos;

	public Medico(String crm, String nome, Double salario, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		totalMedicos += 1;
	}

	public static int getTotalMedicos() {
		return totalMedicos;
	}

	public static void setTotalMedicos(int totalMedicos) {
		Medico.totalMedicos = totalMedicos;
	}

	@Override
	public String toString() {
		return "crm: " + crm + "\nnome: " + nome + "\nsalario: " + salario + "\nvalorConsulta: " + valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
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

	public void pagamentoDinheiro(double valorConsulta) {
		salario += valorConsulta;
	}
	public void pagamentoPlano(double valorConsuta) {
		salario += valorConsulta * 0.70;
		
	}
}
