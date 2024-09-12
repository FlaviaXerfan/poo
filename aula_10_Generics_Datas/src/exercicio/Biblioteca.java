package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String responsavel;
	List<Livro> livros = new ArrayList<>();

	public List<Livro> getLivros() {
		return livros;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void adicionar(Livro livro) {
		livros.add(livro);
	}

	public void listar() {
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}

	public Integer pesquisarFaixaDePreco(double valorInicial, double valorFinal) {

		for (Livro livro : livros) {
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				return livros.indexOf(livro);
			}
		}
		return null;
	}

	public double calcularTotalLivros() {
		double total = 0.;
		for (Livro livro : livros) {
			total = total + livro.getPreco();
		}
		return total;
	}
}
