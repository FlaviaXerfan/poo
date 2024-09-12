package exercicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoEmArquivo {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\\\\\\\Users\\\\\\\\Flavia\\\\\\\\Desktop\\\\\\\\teste.txt"));
			out.append("Flavia está ficando maluca com Java");
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}

	}

}
