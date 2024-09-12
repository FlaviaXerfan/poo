package relacao;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();

	public Contato(String nome) {
		this.nome = nome;

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nContato: " + nome  + telefones + endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void adcionarTelefone(List<Telefone>tels) {
		telefones.addAll(tels);
	}

	public void listarTelefones() {
		for (Telefone v : telefones) {
			System.out.println(v.getNumero());
		}
	}
}
