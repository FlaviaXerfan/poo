package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Criar uma classe chamada Cliente com os atributos: id, nome, idade, telefone. Faça um programa para solicitar os
dados de vários clientes usando o Scanner e armazenar em um ArrayList até que se digite um número de id negativo.
Em seguida exiba os dados de todos os clientes em um foreach via System.out, formatando cada objeto separado por
linhas.*/

public class Sistema {
	public static void main(String[] args) {

		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o id do cliente ou digite um número negativo para sair: ");
			int id = sc.nextInt();

			if (id < 0) {
				break;

			}

			System.out.println("Digite o nome do cliente:");
			String nome = sc.next();

			System.out.println("Digite a sua idade");
			int idade = sc.nextInt();

			System.out.println("Telefone");
			String telefone = sc.next();

			System.out.println("\nID Cliente " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone);

			Cliente cliente = new Cliente(id, nome, idade, telefone);
			//System.out.println(cliente.nome + "teste1");

			lista.add(cliente);
			
			System.out.println("\nCadastrado com sucesso!");
			System.out.println();

		}
		System.out.println("Dados de clientes cadastrados");
		
		for (Cliente cliente : lista) {
			System.out.println(cliente);
			
		}
		sc.close();
	}

}
