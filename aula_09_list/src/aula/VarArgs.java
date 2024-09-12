package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		total = calcularSoma(10,20,40,100,200);
		//total = calcularSoma();
		System.out.println("Total: " + total);
		
	}
//quem chamar este método poderá passar quantos valores quiser, separados por vígula
	public static int calcularSoma(int num, int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		System.out.println("Soma:" + soma);
		return soma * num;
	}

}
