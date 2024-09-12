package aula_08_Excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args)   {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\Flavia\\Desktop\\SERRATEC\\Programação orientada a objeto - material\\ExemploAula1.txt");
			System.out.println("Arquivo encontrado");
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
			e.printStackTrace();
		}
				

	}

}
