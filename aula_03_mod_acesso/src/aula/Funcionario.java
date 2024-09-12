package aula;

import javax.swing.JOptionPane;

public class Funcionario {
	private String cpf;
	private String nome;
	private Double salarioBruto;
	private static int total=0;
	
	public Funcionario() {
		// TODO Auto-generated constructor stubFica escondido, porém implícito. Ctrl + barra espaço ele aparece
		
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public static int getTotal() {
		return total;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalarioBruto(Double valor) {
		if (salarioBruto > 1402.) {
			
			this.salarioBruto = salarioBruto;
		}else {
			JOptionPane.showConfirmDialog(null, "Salário Inválido");
		}
	}
	
	/*public void setTotal(int total) {
		this.cpf = cpf;
	}*/
	//Salario Liquido * 11% de INSS e 6% VT
	
	public Double calcularFolha() {
		registro ();
		return salarioBruto * 0.83;
	}

	private static int registro() {
		return total++;
		
	}

}
