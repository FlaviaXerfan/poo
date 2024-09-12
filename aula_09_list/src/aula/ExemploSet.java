package aula;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		//Set - é uma interface
		//HashSet - não aceita elementos duplicados
		
		Set<String> lista = new TreeSet<>();
	//	Scanner sc = new Scanner(System.in);
	//	String time = sc.next().toUpperCase(); - colocar tudo maiúsculo
		
		
		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("Botafogo");
		lista.add("Botafogo");
		lista.add("Fluminense");
		
		System.out.println(lista);
		
		

	}

}
