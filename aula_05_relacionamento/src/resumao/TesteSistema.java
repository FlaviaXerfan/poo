package resumao;

public class TesteSistema {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		Imovel imovel = new Imovel("25740-150", 25000.20);
		System.out.println(imovel.getLocal() + imovel.calculaImpostoDeVenda());
		
		Proprietario proprietario = new Proprietario("Flavia", imovel);
		System.out.println(proprietario.getNome() + proprietario.getImovel().getLocal());
		

	}

}
