package aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class revisaoListas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Branco");
		lista.add("Preto");
		lista.add("Amarelo");
		lista.add("Azul");
		Collections.sort(lista); // ordena alfabeticamente -String
		System.out.println(lista);

		Set<Integer> numeros = new HashSet<>(); // imprimi de forma aleatória
		// Set<Integer>numeros = new TreeSet<>(); // imprime ordenado
		// (alfabético/numérico)
		// Set<Integer> numeros = new LinkedHashSet<>(); // imprime ordem em que foram
		// inseridos
		numeros.add(10);
		numeros.add(10);
		numeros.add(45);
		numeros.add(25);
		numeros.add(55);
		System.out.println(numeros);

	}

}
