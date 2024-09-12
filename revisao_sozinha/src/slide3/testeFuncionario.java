package slide3;

public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Adriano", 3000.);
		
		f1.calcularSalarioLiquido();
		
		System.out.println("Nome: "  + f1.getNome());
		System.out.println("Salário: R$ " + String.format("%.2f", f1.getSalario()));
		System.out.println("INSS R$ " + String.format("%.2f",f1.calcularInss()));
		System.out.println("VT: R$ " + String.format("%.2f", f1.calcularValeTransporte()));
		System.out.println("Salário Líquido: R$ " + String.format("%.2f", f1.calcularSalarioLiquido()));
		

	}

}
