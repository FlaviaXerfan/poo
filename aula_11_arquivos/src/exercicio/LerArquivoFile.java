package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoFile {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\Flavia\\Desktop\\teste.txt");
		Scanner sc;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNext()) {
				System.out.println(sc.next());

			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		}
	}

}
