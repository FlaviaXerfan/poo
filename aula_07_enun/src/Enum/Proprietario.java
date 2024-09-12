package Enum;

public class Proprietario {
	public String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proprietario:" + nome;
	}

	public String getNome() {
		return nome;
	}

}
