package exercicios;

public class TestaAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");
		Atleta a1 = new Atleta("Anderson Silva", 98., "Peso Pesado", p1);
		Atleta a2 = new Atleta("Jon Jone", 59., "Peso Médio", p2);
		Atleta a3 = new Atleta("Vitor Belfort", 110., "Peso Pesado", p1);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("\n");
		System.out.println("O total de participantes será: " + Atleta.getTotalParticipantes() + ("."));
	}

}
