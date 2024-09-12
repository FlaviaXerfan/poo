package enumeradores;

import java.util.Arrays;
import java.util.List;

public class EscolaMunicipal extends Escola {

	private final String SEGMENTO;

	public EscolaMunicipal(String cnpj, String razaoSocial, String sEGMENTO) {
		super(cnpj, razaoSocial);
		SEGMENTO = sEGMENTO;
	}

	public static void mais(String[] args) {
		/*
		 * List<String> cores = new ArrayList<>(); cores.add("Branco");
		 */

		List<String> times = Arrays.asList("Flamengo", "Vasco");
		times.set(0, "Flamengo");
		System.out.println(times);
		times.add("Botafogo");

		EscolaMunicipal em = new EscolaMunicipal("123", "Liceu", "Fundamental");

	}

}
