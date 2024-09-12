package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Checkup", "123456");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "Geral");
		

		c.calcularPagamento();
		m.calcularPagamento();
		a.calcularPagamento();

		
		
		
		System.out.println("Clinica:");
		System.out.println(c);
		System.out.println("\nMédico:");
		System.out.println(m);
		System.out.println("\nAnestesista");
		System.out.println(a);

	}

}
