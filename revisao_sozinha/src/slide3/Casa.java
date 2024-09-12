package slide3;

public class Casa extends ImovelProprietario {
	private Boolean garagem;

	public Casa(String local, double valorImovel, Boolean garagem) {
		super(local, valorImovel);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return "garagem: " + garagem;
	}

	
	

}
