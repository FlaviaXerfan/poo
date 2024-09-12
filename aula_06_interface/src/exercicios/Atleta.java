package exercicios;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private Pais pais;
	private static Integer totalParticipantes = 0;

	public Atleta(String nome, Double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "O Atleta " + nome + " " + verificaSituacao() + ".";
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static Integer getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String verificaSituacao() {

		if (peso > 90) {
			modalidade = "peso pesado";
			totalParticipantes++;
			return "participará";
		} else if (peso > 60 && peso < 90) {
			modalidade = "peso médio";
			totalParticipantes++;
			return "participará";
		} else {
			return "não participará";
		}

	}

}
