package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rato {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (new File("C:\\Users\\Flavia\\Desktop\\rato.txt"));
			sc.useDelimiter("-");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquico não encontrado");
		e.printStackTrace();
		}

	}

}
