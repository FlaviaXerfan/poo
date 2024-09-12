package slide3;

public class TesteMaratona {

	public static void main(String[] args) {
		Maratona a1 = new Maratona("Caio", "masc", 25, 1.70);
		Maratona a2 = new Maratona("Ana", "fem", 15, 1.90);
		Maratona a3 = new Maratona("Bruno", "masc", 25, 1.85);
		
		System.out.println(a1.toString());
		a1.verificaSituacao();
		System.out.println("\n" + a2.toString());
		a2.verificaSituacao();
		System.out.println("\n" + a3.toString());
		a3.verificaSituacao();

	}

}
