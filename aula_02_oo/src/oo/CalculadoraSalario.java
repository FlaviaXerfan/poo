package oo;

public class CalculadoraSalario {

	public static void main(String[] args) {
		//String nome = ("Flavia");
		double salario = 1500;

		if (salario <= 1751.81) {
			salario = salario * 0.92;
		} else if (salario <= 2919.72) {
			salario = salario * 0.91;
		} else if (salario <= 5839.45) {
			salario = salario * 0.90;
		} else {
			salario = salario * 0.89;
		}
		System.out.println("Salário com desconto: " + salario);
	}
}
