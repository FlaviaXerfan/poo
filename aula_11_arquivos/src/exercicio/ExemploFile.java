package exercicio;

import java.io.File;
import java.util.Scanner;

public class ExemploFile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe o nome de um arquivo ou diretório:\n");
		String nome = ler.nextLine();

		File file = new File(nome);
		if (file.exists()) {
			if (file.exists()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n", file.getName(), file.length());
				;
			} else {
				System.out.printf("\nConteúdo do diretório:\n");
				String diretorio[] = file.list();
				for (String item : diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		}else {
			System.out.println("Arquivo ou diretório informado não existe\n");
		}
		ler.close();
	}

}
