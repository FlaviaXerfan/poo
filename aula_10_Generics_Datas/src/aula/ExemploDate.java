package aula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {

		/*
		 * Date dataAtual = new Date(); System.out.println(dataAtual);
		 */

		/*
		 * Calendar hoje = Calendar.getInstance(); System.out.println(hoje); int ano =
		 * hoje.get(Calendar.DAY_OF_MONTH);
		 */

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		LocalDate entrada = LocalDate.of(2024, 9, 6);
		System.out.println(entrada.plusDays(30));
		System.out.println(entrada.minusDays(30));
		System.out.println(entrada.isLeapYear()); // verifica ano bisexto

		System.out.println();
		LocalTime hora = LocalTime.of(9, 30);
		LocalTime horaEntrada = LocalTime.of(8, 00);
		System.out.println(hora);
		System.out.println(horaEntrada);
		System.out.println(hora.plusHours(2));

		System.out.println();
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);

		ZoneId fuso = ZoneId.systemDefault(); // meu fuso
		System.out.println(fuso);

		/*
		 * for (String f: ZoneId.getAvailableZoneIds()) { //todos os fusos existentes
		 * System.out.println(f); }
		 */

	}

}
