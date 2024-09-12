package exerciciosSlide03;

import java.util.Scanner;

public class Icms {

	public static void main(String[] args) {

		ProdutoIcms produtoIcms = new ProdutoIcms("Arroz", 25.0, 2);

		System.out.println("Produto: " + produtoIcms.getDescricao());
		System.out.println("Valor unitário: R$ " + produtoIcms.getValor());
		System.out.println("Quantidade: " + produtoIcms.getQuantidade());

		System.out.println("ICMS: R$ " + produtoIcms.ProdutoIcms());

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja encerrar o programa? (S/N)\n");

		char resposta;
		resposta = sc.next().charAt(0);

		if (resposta == 'S') {
			System.out.println("Obrigada");
		} else {
			System.out.println("O que deseja consultar?");
		}
		sc.close();
	}

}
