package aula_08_Excecoes;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {

	private Produto produto;
	private LocalDate dataCompra;
	private Integer quantidade;
	private static Double totalVenda = 0.;

	public Venda(Produto produto, LocalDate dataCompra, Integer quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;

	}

	@Override
	public String toString() {
		return "produto: " + produto + "\ndataCompra: " + dataCompra + "\nquantidade: " + quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public static Double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += quantidade * produto.getValor();
		mostrarVenda();
	}

	private void mostrarVenda() {
		System.out.println(produto.getDescricao() + " R$ " + String.format("%.2f", (quantidade * produto.getValor())));
	}

}
