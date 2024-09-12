package slide3;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ana", "25740-150", "2122454940");
		Imovel i = new Imovel("Petrópolis", "Casa", 500000., p);
		
		System.out.println(i.getDono() + "\n" + i.getTipo() + "\n" + i.getValor()); 
		
		

	}

}
