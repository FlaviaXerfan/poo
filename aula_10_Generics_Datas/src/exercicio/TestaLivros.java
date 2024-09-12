package exercicio;

public class TestaLivros {

	public static void main(String[] args) {

		Livro l1 = new Livro("O sol é para todos", "Harper Lee", 120.);
		Livro l2 = new Livro("O iluminado", "Stephen King", 135.);
		Livro l3 = new Livro("O pequeno Príncipe", "Antoine de Saint-Exupéry", 89.);
		Biblioteca b = new Biblioteca();

		b.adicionar(l1);
		b.adicionar(l2);
		b.adicionar(l3);

		b.listar();

		System.out.println("\nLivros na faixa de preço: " + b.getLivros().get(b.pesquisarFaixaDePreco(80., 100.)));

		System.out.println("\nValor total dos livros: " + String.format("%.2f", b.calcularTotalLivros()));
	}

}
