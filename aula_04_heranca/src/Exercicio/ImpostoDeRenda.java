package Exercicio;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected Double rendimentos;

	public ImpostoDeRenda(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
