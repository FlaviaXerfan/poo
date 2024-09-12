package aula_08_Excecoes;

import java.util.Iterator;

public class ExemploException {

	public static void main(String[] args) {
		int[] numerador = { 1, 2, 3, 4, 5 };
		int[] denominador = { 3, 0, 2 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println(
						"dividindo: " + numerador[i] + "/" + denominador[i] + "=" + (numerador[i] / denominador[i]));
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu um problema na divisão");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um problema ao acessar um indice de vetor que não existe");
			}

		}

	}

}
