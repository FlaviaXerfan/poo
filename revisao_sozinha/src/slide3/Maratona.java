package slide3;

public class Maratona {
	protected String nome, sexo;
	protected Integer idade;
	protected Double altura;
	
	public Maratona(String nome, String sexo, Integer idade, Double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nsexo: " + sexo + "\nidade: " + idade + "\naltura: " + altura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}
	
	public void verificaSituacao() {
		if (idade > 18 && altura >= 1.80) {
			System.out.println("Participará");
		}else {
			System.out.println("Não participará");
		}
		
	}
	

}
