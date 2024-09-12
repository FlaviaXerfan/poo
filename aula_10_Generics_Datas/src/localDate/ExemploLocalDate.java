package localDate;

import java.time.LocalDate;
import java.time.Period;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate dataHoje = LocalDate.now();
		LocalDate dataNasc = LocalDate.of(1991, 11, 24);
		System.out.println("Dia da Semana: " + dataNasc.getDayOfWeek().name());
		System.out.println("Dia da Semana: " + dataNasc.getDayOfWeek().ordinal());
		System.out.println("Mês: " + dataNasc.getMonthValue());
		System.out.println("Mês: " + dataNasc.getMonth().name());
		System.out.println("Ano: " + dataNasc.getYear());

		Period period = Period.between(dataNasc, dataHoje);
		System.out.println("Passaram: " + period.getYears() + " anos");
		System.out.println(period.getMonths() + " meses");
		System.out.println(period.getDays() + " dias");

	}

}
