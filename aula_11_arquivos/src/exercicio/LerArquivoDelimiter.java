package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerArquivoDelimiter {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("C:\\\\Users\\\\Flavia\\\\Desktop\\\\teste.txt"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.next());
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo naõ encontrado");
			e.printStackTrace();
		}

	}

}
