package vetor;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func [] = new Funcionario [2];
		func [0] = new Funcionario("Adriana", "Analista de sistemas", 5000.);
		
		
		func [1] = new Funcionario("Leonardo", "Advogado", 4200.);
		
				
		for(int i=0; i < func.length; i++) {
			System.out.println(func[i].getNome() + "\nCargo: " + func[i].getCargo());
			System.out.println("Salário: R$ " + func[i].abonoSalarial(i));
		}
		
	}

}
