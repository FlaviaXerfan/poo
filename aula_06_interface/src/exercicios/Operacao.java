package exercicios;

public class Operacao implements Livraria {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + "\nValor: R$ " + String.format("%.2f", valorOperacao) + "\n" + livro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + TAXAEMPRESTIMO;

	}

	@Override
	public void venderLivre() {
		valorOperacao = livro.getValor() * 1.09;
	}

}
