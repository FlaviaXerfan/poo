package Exercicio;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Fixo f1 = new Fixo("Joana", "1234567890", 2000., 0.03);
		Fixo f2 = new Fixo("Maria", "9876543219", 2000., 0.03);

		char opcao;
		Double valorVenda;
		Double total = 0.;

		System.out.println("Sistema de venda:");
		
		do {
			System.out.println("Vendedores:\n1-Joana\n2-Maria");
			System.out.println("Escolha o vendedor:");
			opcao = sc.next().charAt(0);
			
			switch (opcao) {
			case '1':
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				total += valorVenda;
				f1.calcularSalario(valorVenda);
				break;
			case '2':
				System.out.println("Digite o valor da venda: ");
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
