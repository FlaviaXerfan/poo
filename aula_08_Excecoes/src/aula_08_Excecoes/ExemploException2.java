package aula_08_Excecoes;

import java.util.Scanner;

public class ExemploException2 {

	public static void main(String[] args) {
		try {
			double num = LerNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {
			System.out.println("Falaha ao digitar o número!");
		}

	}
public static double LerNumero() throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número: ");
	double numero = sc.nextDouble();
	sc.close();
	return numero;
}
}
