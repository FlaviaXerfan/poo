package slide3;

public class Pessoa {
	private String nome, cep, telefone;

	public Pessoa(String nome, String cep, String telefone) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncep: " + cep + "\ntelefone: " + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
