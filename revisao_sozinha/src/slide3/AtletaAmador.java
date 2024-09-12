package slide3;

public class AtletaAmador extends Maratona {
	private Boolean atestado;

	public AtletaAmador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	@Override
	public String toString() {
		return "atestado: " + atestado;
	}

	public Boolean getAtestado() {
		return atestado;
	}
	
	

}
