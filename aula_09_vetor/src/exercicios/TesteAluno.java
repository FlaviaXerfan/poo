package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Flavia", 6.5, 7.5);
		Aluno a2 = new Aluno("Ana", 6.5, 9.5);
		Aluno a3 = new Aluno("Bia", 7., 8.5);

		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

		System.out.println(lista.size() + "\n");

		try {
			for (Aluno aluno : lista) {
				System.out.println("Nome: " + aluno.nome + "\nNota1" + aluno.nota1 + ", Nota 2 " + aluno.nota2 + "\n" + "Média: "
						+ aluno.CalculaMedia()+ "\n");

			}

		} catch (AlunoException e) {
			System.out.println(e.getMessage());

		}
	}
}
