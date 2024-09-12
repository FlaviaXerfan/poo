package exercicios;

public class testeLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.0);
		Livro l2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98.0);

		Operacao o1 = new Operacao("Venda", l1);
		Operacao o2 = new Operacao("Emprestimo", l2);

		l1.reajuste(1.06);

		o1.venderLivre();
		o2.emprestarLivro();

		System.out.println(o1);
		System.out.println();
		System.out.println(o2);

	}

}
