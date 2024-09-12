package slide3;

public class Gerente extends Funcionario1 {
	protected String setor;

	public Gerente(String nome, Double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "setor: " + setor;
	}

	public double aumentarSalario() {
		return super.aumentarSalario() + 200.0;
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
		
		
	
	

}
