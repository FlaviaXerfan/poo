package aula_08_Excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TransformarMaiusculo {

	public static void main(String[] args) {
		try {
			FileReader pw = new FileReader ("aula14.txt");
		} catch (FileNotFoundException f) {
			System.out.println("Arquivo não existe");
		}
		
		
		
	}
}
