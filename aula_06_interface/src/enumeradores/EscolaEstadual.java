package enumeradores;

public class EscolaEstadual extends Escola {
	
	// o valor não pode ser alterado
	private final String SEGMENTO = "Médio";

	public EscolaEstadual(String cnpj, String razaoSocial) {
		super(cnpj, razaoSocial);

	}
	
	//Não pode ser sobrescritopelos filhos 
	public final void gerarRelatorio() {
		System.out.println("Relatório!");
	}
	
}
