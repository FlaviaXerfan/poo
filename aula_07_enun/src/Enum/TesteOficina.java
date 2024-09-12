package Enum;

import java.time.LocalDate;


public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p = new Proprietario(" Flavia");
		Carro carro = new Carro("Ford", LocalDate.of(2024, 9, 07), p, "carro");
		
		carro.valorCobrado += carro.trocarOleo();
		carro.valorCobrado += carro.revisao();

		System.out.println(carro);

	}
	
}
