package oo;

public class MultiplosDeDois {

	public static void main(String[] args) {
		int total = 0;

		for (int contador = 1; contador <= 22
				; contador++) {
			int resto = contador % 2;
			if (resto == 0) {
				System.out.println(contador + " é multiplo de 2");
				total += 1;
			}
		}
		System.out.println("Total de números múltiplos de 2: " + total);
	}

}
