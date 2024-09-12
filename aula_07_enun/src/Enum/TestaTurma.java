package Enum;

public class TestaTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(123, PeriodoCurso.INTEGRAL);

		System.out.println("Curso: " + turma.getNumero());
		System.out.println("Período/Dias: " + turma.getPeriodoCurso() + "/ " + turma.getPeriodoCurso().getDia());
		System.out.println("Carga horária: " + turma.getPeriodoCurso().getCargaHoraria() + " horas");
		System.out.println("Valor: R$ " + turma.getPeriodoCurso().getValor());

	}

}
