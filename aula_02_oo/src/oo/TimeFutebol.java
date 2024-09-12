package oo;

public class TimeFutebol {

	public static void main(String[] args) {
		String day = "Atlético";
		String result = switch (day) {
		case "Flamengo", "Fluminense", "Botafogo", "Vasco" -> "Time do Rio de Janeiro";
		case "São Paulo", "Corintias" -> "Time de São Paulo";
		default -> "Time de outro Estado";
		};
		System.out.println(result);
	}

}
