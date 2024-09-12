package aula;

public class CalculoImc {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		p.setCodigo(123);
		p.setNome("Flavia");
		p.setAltura(1.69);
		p.setPeso(75.);

		System.out.println("Resultado: " + p.resposta());

	}

}
