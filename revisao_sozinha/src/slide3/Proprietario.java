package slide3;

public class Proprietario {
	public String nome;
	public ImovelProprietario imovelProprietario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ImovelProprietario getImovelProprietario() {
		return imovelProprietario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nimovelProprietario: " + imovelProprietario;
	}

	public Proprietario(String nome, ImovelProprietario imovelProprietario) {
		super();
		this.nome = nome;
		this.imovelProprietario = imovelProprietario;
	}

	public void setImovelProprietario(ImovelProprietario imovelProprietario) {
		this.imovelProprietario = imovelProprietario;
	}

}
