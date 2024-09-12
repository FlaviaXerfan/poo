package slide3;

public class TestaImovelProprietario {

	public static void main(String[] args) {
		ImovelProprietario a1 = new ImovelProprietario("Posse", 500000.0);
		ImovelProprietario a2 = new ImovelProprietario("Centro", 800000.0);
		
		Proprietario p1 = new Proprietario("Ana", a1);
		Proprietario p2 = new Proprietario("Bia", a2);
		
		System.out.println("Proprietario: " + p1.getNome() + "\n" + a1.toString() 
		+ "\nITBI: R$ " + String.format("%.2f",a1.calcularImpostoVenda()));
		System.out.println("\nProprietario: " + p2.getNome() + "\n" + a2.toString() 
		+ "\nITBI: R$ " + String.format("%.2f",a2.calcularImpostoVenda()));
		

	}

}
