package exercicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LerArquivoFileReader {

	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new FileReader("C:\\\\\\\\Users\\\\\\\\Flavia\\\\\\\\Desktop\\\\\\\\teste.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}

	}

}
