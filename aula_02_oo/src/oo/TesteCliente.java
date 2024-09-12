package oo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c2 = new Cliente ();
		Cliente c3 = new Cliente ();
		//Cliente c4 = new Cliente ();
		
		
		
		Cliente c = new Cliente ();
		
		c.nome = "Maria";
		c.nome.toUpperCase();
		c.cpf = "123";
		c.telefone = "22435632";
		
		c2.nome = "Maria";
		c3.nome = "Joaquim";
		
		if (c==c2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		System.out.println(c.nome);
		//System.out.println(c2);
	}

}
