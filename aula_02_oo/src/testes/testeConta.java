package testes;

import banco.Conta;

public class testeConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Roni";
		conta1.saldo = 200.0;

		conta1.deposito(500.);
		
		
		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Ana";
		conta2.saldo = 2000.;
		conta2.deposito(100.);
		
		
		if (conta1.saque(900.)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Saldo insufuciente!");
		}

		System.out.println(conta1.saldo);

	}

}
