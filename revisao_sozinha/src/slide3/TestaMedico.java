package slide3;

import java.io.ObjectInputStream.GetField;

public class TestaMedico {

	public static void main(String[] args) {
		Medico m1 = new Medico("12345", "Ana Maria", 0.,250.);
		Medico m2 = new Medico("67890", "Antonio", 0., 300.);
		
		m1.pagamentoDinheiro(250);
		m2.pagamentoPlano(300);
		
		
		
		System.out.println("A médica " + m1.getNome() + " recebeu em dinheiro R$ " + String.format("%.2f", m1.getSalario()));
		System.out.println("O médico " + m2.getNome() + " recebeu pelo plano o valor de R$ " + String.format("%.2f", m2.getSalario()));
		System.out.println("O total de médico é: " + Medico.getTotalMedicos());

	}

}
