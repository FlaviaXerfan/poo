package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Assitente a = new Assitente("Roberto", 2200., "noite", "Nivel-1");
		Diretor d = new Diretor("Ana", 8500.0, "Integral", "Financeiro");
		
		a.reajusteSalarial();
		d.reajusteSalarial();
		
		System.out.println(a);
		System.out.println(d);
		
		

	}

}
