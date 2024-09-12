package Enum;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);
		pedido.imprimirCardapio();

		System.out.println("\n*************************");
		System.out.println(pedido);
		System.out.println("*************************");
		System.out.println("Total do Pedido: R$ " + String.format("%.2f", pedido.calcularPedido()));
		System.out.println("*************************");

	}

}
