package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLista {

	public static void main(String[] args) {
		List<String> bichos = Arrays.asList("Cachorro", "Gato", "Coelho", "Pato");
		
		//bichos.add("Rato"); - é imutável, não aceita.
		
		bichos.set(3,"Papagaio");
		
		if(bichos.isEmpty()) {
			System.out.println("Alista está vazia");
		}
		//System.out.println(bichos.get(0));
		
		Collections.sort(bichos); //coloca alista do tipo String em ordem alfabética
		System.out.println(bichos);
		
		
		

	}

}
