package exercicio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MainBinario1 {

	public static void main(String[] args) {
		try {
			FileInputStream arq = new FileInputStream("arquivo.dat");
			DataInputStream lerArq = new DataInputStream(arq);
			String resultado = lerArq.readUTF();
			System.out.println(resultado);
			lerArq.close();
			
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}

	}

}
