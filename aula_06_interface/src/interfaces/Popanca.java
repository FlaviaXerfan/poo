package interfaces;

public class Popanca implements Conta {
	private String titular;
	private Double saldo;

	public Popanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular=" + titular + "\nsaldo" + saldo;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void saque(Double valor) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - valor;
			System.out.println("Saque efetuado com sucesso");
		}

	}

	@Override
	public void deposito(Double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido");
		} else {
			System.out.println("Depósito efetuado");
		}

	}

}
