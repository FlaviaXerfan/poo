package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		estados.put("MG", "Minas Gerais");

		// System.out.println(estados.keySet());

		/*for (String s : estados.keySet()) { // imprime a chave
			System.out.println(s);
		}

		for (String s : estados.values()) { // imprime o valor
			System.out.println(s);
		}*/
		
		System.out.println("-----------------------");
		for (Map.Entry<String, String> dados : estados.entrySet()) { //imprime chave e valor
			System.out.println(dados.getKey() + " " + dados.getValue());
		}
	}

}
