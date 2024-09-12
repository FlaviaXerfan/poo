package slide3;

public class TestaSalario {
	public static void main(String[] args) {
	
	Gerente g = new Gerente("Ana", 2000., "Vendas");
	Assistente a = new Assistente("José", 1000., 100.);
	
	System.out.println("Salário Gerente " + g.nome + " é R$ " + g.aumentarSalario());
	
	System.out.println("Salario Assitente " + a.nome  + " é R$ " + a.aumentarSalario());

	
	

	}

}
