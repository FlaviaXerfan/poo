package exercicio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Faça um programa que leia no console o nome, idade e altura de
uma pessoa e escreva em um arquivo binário.

Depois leia este arquivo e apresente os dados no console.*/

import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		arquivoBinario n1 = new arquivoBinario();

		System.out.println("Digite seu nome: ");
		n1.setNome(sc.next());
		System.out.println("Digite sua idade: ");
		n1.setIdade(sc.nextInt());
		System.out.println("Digite sua altura: ");
		n1.setAltura(sc.nextDouble());

		System.out.println("\nAqui estão seus dados: ");
		System.out.println("\n" + n1);

		try {
			FileOutputStream arq = new FileOutputStream("arquivo.dat");
			DataOutputStream gravarArq = new DataOutputStream(arq);
			gravarArq.writeChars(n1.getNome() + "\n");
			gravarArq.writeChars(String.valueOf(n1.getIdade()) + "\n");
			gravarArq.writeChars(String.valueOf(n1.getAltura()));
			gravarArq.close();

		} catch (IOException e) {
			System.out.println("Erro ao acessar o arquivo");
		}

		sc.close();
	}

}
