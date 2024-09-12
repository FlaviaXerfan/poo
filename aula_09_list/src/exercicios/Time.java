package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private String tecnico;
	private String diretor;
	private List<Atleta> atletas = new ArrayList<>();

	public Time(String nome, String tecnico, String diretor) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void adicionarAtleta(Atleta atleta) {
		atletas.add(atleta);

	}

	public void mostrarTime() {
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
	}
}
