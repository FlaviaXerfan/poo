package oo;

public class SituacaoAluno {

	public static void main(String[] args) {
		double nota1 = 10, nota2 = 10;
		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println("Aprovado com louvor, parabéns!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
