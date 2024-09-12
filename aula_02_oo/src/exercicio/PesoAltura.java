package exercicio;

import javax.swing.JOptionPane;

public class PesoAltura {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		String peso = JOptionPane.showInputDialog("Informe seu peso:");
		String altura = JOptionPane.showInputDialog("Informe seu altura:");

		System.out.println("A funcionaria " + nome + " tem: " + altura + " de altura e " + peso + " kilos");

	}

}
