package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteMarca {

	public static void main(String[] args) {
		List<Marca> marca = new ArrayList<>();
		List<Marca> marca2 = Arrays.asList(new Marca(4, "Chevrolet"), 
										   new Marca(5, "BMW"));
		
		
		marca.add(new Marca(1, "VW"));
		marca.add(new Marca(2, "Fiat"));
		marca.add(new Marca(3, "Nissan"));
		marca.addAll(marca2);
		
		
		
		System.out.println(marca);
		
		
		
		

	}

}
