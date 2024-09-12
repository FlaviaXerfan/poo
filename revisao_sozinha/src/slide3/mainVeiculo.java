package slide3;

public class mainVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("LZX0990", "Flex", 20000.);
		Veiculo v2 = new Veiculo("KYZ1080", "Gasolina", 40600.);
		
		
		System.out.println("Ipva do Veículo é R$ " + v1.calcularIPVA());
		System.out.println("Ipva do Veículo é R$ " + v2.calcularIPVA());
	}

}
