package exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Flavia\\\\Desktop\\\\teste.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();

		} catch (IOException e) {
			System.out.println("erro ao acessar arquivo");
		}

	}

}
