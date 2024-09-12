package exercicio;

public class Livro {
	private String titulo, autor;
	private double preco;

	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nAutor: " + autor + "\nPreco: " + String.format("%.2f",preco) + "\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

}
