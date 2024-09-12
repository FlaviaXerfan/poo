package relacao;

import java.util.Arrays;
import java.util.List;

public class TesteCidade {

	public static void main(String[] args) {

		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Petrópolis", estado1);
		Endereco endereco1 = new Endereco("Rua 16 de março", "Centro", "25620-040", cidade1);
		//Telefone telefone1 = new Telefone("4002-8922");
		//Telefone telefone2 = new Telefone("22334455");
		List<Telefone> telefones = Arrays.asList(new Telefone("4002-8922"), new Telefone("22334455"));
		Contato contato1 = new Contato("Matheus");
		contato1.adcionarTelefone(telefones);
		//contato1.adcionarTelefone(telefone2);
		contato1.setEndereco(endereco1);

		System.out.println(contato1);

	}

}
