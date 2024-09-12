package vetor;

public class Pessoa {
	public String nome;
	public String cpf;
	public Integer idade;

	public Pessoa(String nome, String cpf, Integer idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncpf: " + cpf + "\nidade: " + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
