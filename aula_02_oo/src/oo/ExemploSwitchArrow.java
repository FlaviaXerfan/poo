package oo;

public class ExemploSwitchArrow {

	public static void main(String[] args) {
		String day = "Sexta";
		String result = switch (day) {
		case "Segunda", "Terça", "Quarta", "Quinta" -> "Dia útil: vá trabalhar!";
		case "Sexta" -> "Sextou!";
		case "Sábado", "Domingo" -> "Final de semana: dia de descansar";
		default -> "Dia inválido";
		};
		System.out.println(result);
	}

}
