package exercicios;

public class TestaTime {

	public static void main(String[] args) {
		
	
		Atleta a1 = new Atleta("Gabi", 26, "ponteira");
		Atleta a2 = new Atleta("Thaisa", 28, "central");
		Atleta a3 = new Atleta("Macris", 30, "levantadora");
		Atleta a4 = new Atleta("Galardi", 31, "ponteira");
		Atleta a5 = new Atleta("Bettini", 27, "central");
		Atleta a6 = new Atleta("Banchelli", 26, "levantadora");
		
		Time t1 = new Time("Brasil", "Zé Roberto","Marcelo");
		Time t2 = new Time("Italia", "Silipo", "Eduardo");
		
		t1.adicionarAtleta(a1);
		t1.adicionarAtleta(a2);
		t1.adicionarAtleta(a3);
		t2.adicionarAtleta(a4);
		t2.adicionarAtleta(a5);
		t2.adicionarAtleta(a6);
		
		
		System.out.println("Time :" + t1.getNome());
		t1.mostrarTime();
		System.out.println("------------------------");
		System.out.println("\nTime :" + t2.getNome());
		t2.mostrarTime();
		
		
		
		
		
		
		
		

	}

}
