package diversos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		// comentário
		/*final int valor = 100;
		double calculo = 0;
		boolean achei = false;
		char estadoCivil = 'S'; */
		String texto = "";
		System.out.println("Hello World!");
		System.out.println ("Java!" + texto);
		JOptionPane.showMessageDialog(null, "Hello World!");
		texto  = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, texto);
	}
}
