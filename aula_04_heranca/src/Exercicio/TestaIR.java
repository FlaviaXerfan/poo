package Exercicio;

public class TestaIR {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Maria", 2000.0, "12345678901", "123456789");
		PessoaJuridica pj = new PessoaJuridica("Cirex", 10000.0, "98745632011198", "963258");

		System.out.println(pf.getNome());
		System.out.println("Valor do Imposto a pagar: R$ " + pf.calcularIR());

		System.out.println(pj.getNome());
		System.out.println("Valor do Imposto a pagar: R$ " + pj.calcularIR());

		// System.out.println(pf.toString());
		// System.out.println(pj.toString());
	}

}
