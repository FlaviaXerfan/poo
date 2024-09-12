package exerciciosSlide03;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		v1.placa = "KYZ9034!";
		v1.tipo = "Flex";
		v1.valor = 20000.;
		v2.placa = "KYZ1080";
		v2.tipo = "Gasolina";
		v2.valor = 40600.;

		System.out.println("O valor do IPVA é: R$ " + v1.calcularIPVA());
		System.out.println("O valor do IPVA é: R$ " + v2.calcularIPVA());
	}

}
