package aula_08_Excecoes;

import java.time.LocalDate;

public class TestaVenda {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(001, "TV", 3000., Categoria.ELETRONICO);
		Produto p2 = new Produto(002, "Pneu", 800., Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(003, "Celular", 2500., Categoria.ELETRONICO);
		Venda v1 = new Venda(p1, LocalDate.now(), 5);
		Venda v2 = new Venda(p2, LocalDate.now(), 4);
		Venda v3 = new Venda(p3, LocalDate.now(), 15);
		
		
		System.out.println("Total por item:");
		System.out.println("----------------------------------");
		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();
		System.out.println("----------------------------------");
		System.out.println("Total Geral da Venda: R$ " + String.format("%.2f", Venda.getTotalVenda()));
		
		
	}

}
