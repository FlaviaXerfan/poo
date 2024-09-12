package slide3;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Fixo f1 = new Fixo("Joana", "0123", 2000., 0.10, 2000.);
		Fixo f2 = new Fixo("Maria", "456", 1000., 0.10, 1000.);

		char opcao;
		Double valorVenda;
		Double total = 0.;

		System.out.println("------Sistema de Vendas-----");

		do {

			System.out.println("Vendedores:\n1 - Joana\n2 - Maria");
			System.out.println("Escolha o vendedor: ");
			opcao = sc.next().charAt(0);

			switch (opcao) {
			case '1':
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				total += valorVenda;
				break;
			case '2':
				System.out.println("Digite o valor da venda: );");
				valorVenda = sc.nextDouble();
				total += valorVenda;
				f2.calcularSalario(valorVenda);
				break;
			default:
				break;
			}

			System.out.println((opcao == '1' || opcao == '2' ? "Deseja encerrar o programa?" : "Opção inválida"));
			opcao = (opcao == '1' || opcao == '2' ? sc.next().charAt(0) : 'N');
			opcao = Character.toUpperCase(opcao);

		} while (opcao != 'S');

		sc.close();

		System.out.println("Salário dos vendedores: ");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("Total vendido: R$ " + total);
	}

}