package Exercicio;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente g = new Gerente("Flavia", 2000., "RH");
		Assitente a = new Assitente("Carlos", 1000., 100.);

		System.out.println("Gerente receberá: R$ " + g.aumentarSalario());
		System.out.println("Assitente receberá: R$ " + a.aumentarSalario());

	}

}
