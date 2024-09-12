package revisao;

import java.time.LocalDate;

public class Venda {

	private Integer codigo;
	private LocalDate data;
	private Integer quantidade;
	private Double valor;
	private Double total;

	public Venda(Integer codigo, LocalDate data, Integer quantidade, Double valor, Double total) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = total;
	}

	public void finalizarVenda() {

		if (data.getDayOfWeek().getValue() == 7) {
			total = valor * quantidade * 0.9;
		} else {
			total = valor * quantidade;
		}

	}

	@Override
	public String toString() {
		return "Venda " + codigo + "\nData: " + data + "\nQuantidade: " + quantidade + "\nValor Unitário: R$ " + valor
				+ "\nTotal da Venda: R$ " + String.format("%.2f", total);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
