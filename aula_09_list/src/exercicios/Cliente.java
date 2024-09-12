package exercicios;

/*Criar uma classe chamada Cliente com os atributos: id, nome, idade, telefone. Faça um programa para solicitar os
dados de vários clientes usando o Scanner e armazenar em um ArrayList até que se digite um número de id negativo.
Em seguida exiba os dados de todos os clientes em um foreach via System.out, formatando cada objeto separado por
linhas.*/

public class Cliente {
	public static int id;
	public String nome;
	public int idade;
	public String telefone;

	public Cliente(int id, String nome, int idade, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void verifica() {
		if (id<= 0 ) {
			throw new ClienteException ("ID inválido");
		}
	}
}
