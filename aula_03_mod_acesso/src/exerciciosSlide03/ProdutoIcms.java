package exerciciosSlide03;

public class ProdutoIcms {

	private static String descricao;
	private static Double valor;
	private static Integer quantidade;

	public ProdutoIcms(String descricao, Double valor, Integer quantidade) {

		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public double ProdutoIcms() {
		return (valor * quantidade) * 0.12;

	}

	public static String getDescricao() {
		return descricao;
	}

	public static void setDescricao(String descricao) {
		ProdutoIcms.descricao = descricao;
	}

	public static Double getValor() {
		return valor;
	}

	public static void setValor(Double valor) {
		ProdutoIcms.valor = valor;
	}

	public static Integer getQuantidade() {
		return quantidade;
	}

	public static void setQuantidade(Integer quantidade) {
		ProdutoIcms.quantidade = quantidade;
	}

}
