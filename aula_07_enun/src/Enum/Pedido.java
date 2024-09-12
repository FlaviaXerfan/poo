package Enum;

import java.time.LocalDate;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	@Override
	public String toString() {
		return "Data Pedido: " + dataPedido + "\nbebida: " + bebida + "\nSanduiche: " + sanduiche;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	public void imprimirCardapio() {
		for (Bebida bebida : Bebida.values()) {
			System.out.println("---------------------");
			System.out.println(bebida.getTipoBebida() + ": R$ " + String.format("%.2f", bebida.getValor()));
		}

		for (Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println("---------------------");
			System.out.println(sanduiche.getTipoSanduiche() + ": R$ " + String.format("%.2f", sanduiche.getValor()));
		}
	}

	public double calcularPedido() {
		return bebida.getValor() + sanduiche.getValor();
	}
}