package aula;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExmploMapa2 {

	public static void main(String[] args) {

		HashMap<Integer, String> pessoas = new HashMap<>();
		//TreeMap<Integer, String> pessoas = new TreeMap<>(); // ordena
		/* LinkedHashMap<Integer, Funcionario> pessoas = new LinkedHashMap<>();//ordem
		// inserida

		pessoas.put(1, new Funcionario("Ana", 20));
		pessoas.put(5, new Funcionario("Bia", 15));
		pessoas.put(3, new Funcionario("Carlos", 48));
		pessoas.put(2, new Funcionario("Daniel", 26));
		pessoas.put(4, new Funcionario("Ana Paula", 30));*/
		
		pessoas.put(1, "Ana");
		pessoas.put(5, "Bia");
		pessoas.put(3, "Carlos");
		pessoas.put(2, "Daniel");
		pessoas.put(4, "Ana Paula");
		

		System.out.println(pessoas);

	}

}
