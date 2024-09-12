package aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {

	public static void main(String[] args) {

		Instant dataHora = Instant.now(); // horário global
		System.out.println(dataHora);

		LocalDateTime dataLocal = LocalDateTime.ofInstant(dataHora, ZoneId.systemDefault());
		System.out.println(dataLocal);

		System.out.println(dataHora.atZone(ZoneId.systemDefault()));
		System.out.println(dataHora.atZone(ZoneId.of("Japan")));

	}

}
