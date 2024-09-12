package revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			sc.close();

		} catch (InputMismatchException e) {
			System.out.println("Erro! Digite um número inteiro!");

		}

	}

}
