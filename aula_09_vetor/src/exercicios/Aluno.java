package exercicios;

public class Aluno {
	public String nome;
	public Double nota1, nota2;

	public Aluno(String nome, Double nota1, Double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nnota1: " + nota1 + "\nnota2: " + nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public double CalculaMedia() {
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
			throw new AlunoException("Valor de nota inválido");
		}
		return (nota1 + nota2) / 2;
	}
}
