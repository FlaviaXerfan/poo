package exercicio;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContarCaracteres {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Flavia\\Desktop\\teste.txt"));
			int quantCaracteres = 0;
			while (br.ready()) {
				String linha = br.readLine();
				quantCaracteres = linha.length();
				System.out.println(quantCaracteres);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
