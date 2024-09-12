package vetor;

public class Cliente {
	public String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "nome: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
