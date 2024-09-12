package exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int multiplicador = 0;
		int total = 0;

		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		System.out.println("+--Resultado-+");
		for (int i = 1; i <= 9; i++) {
			total = numero * ++multiplicador;
		{	
				if (total <10)	
					System.out.println("| " + numero + " * " + i + " = " + total + "  |");
				else 
					System.out.println("| " + numero + " * " + i + " = " + total + " |");
		}
		
		}
		System.out.println("--------------");
	    scanner.close();
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println ("Tabuada do número "+i);
		 * for (int j = 1; j <= 10; j++) { System.out.println(i + " x " + j + " = " + i
		 * * j); } }
		 */
	}
}
