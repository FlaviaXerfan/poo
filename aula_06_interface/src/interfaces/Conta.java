package interfaces;

//Uma interface não pode ser instanciada 
//Não tem implementação
//Atributos são constante, final, sempre tem que ter um valor;
//Sempre é abstrata;

public interface Conta {
	/* final*/ Double IMPOSTO = 10.0;
	/* public*/ void saque(Double  valor);
	/* public*/ void deposito(Double valor);
	
	
	
	
	
}
