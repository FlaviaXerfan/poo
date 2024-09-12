package slide3;

public class Apto extends ImovelProprietario {
	private int andar;

	public Apto(String local, double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	
	@Override
	public String toString() {
		return "andar: " + andar;
	}


	public int getAndar() {
		return andar;
	}
	
	

}
