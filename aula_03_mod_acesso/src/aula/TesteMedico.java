package aula;

public class TesteMedico {

	public static void main(String[] args) {
		
		Medico medico1 = new Medico(12345, "Ana Maria", 0., 250., 0);
		Medico medico2 = new Medico (45678, "Antônio", 0., 300., 0);
		
		medico1.pagamentoDinheiro(250.);
		medico2.pagamentoPlano(300.);
		
		System.out.println(medico1.getNome() + "\n" + medico1.getSalario());
		System.out.println(medico2.getNome()+ "\n" + medico2.getSalario());
		System.out.println("Total de Médico: " + Medico.getTotalMedicos());
		
		
		

	}

}
