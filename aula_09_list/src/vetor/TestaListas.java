package vetor;

import java.util.ArrayList;
import java.util.List;

public class TestaListas {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Manoel", "111", 73);
		Pessoa p2 = new Pessoa("Josefina", "222", 26);
		Pessoa p3 = new Pessoa("Antonio", "333", 26);
		Pessoa p4 = new Pessoa("Solimar", "444", 18);
		Cliente c1 = new Cliente("Roni");

		List <Pessoa>lista = new ArrayList<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		//lista.add(c1);

		//lista.remove(3);

		System.out.println(lista.size());

		for (int i = 0; i < lista.size(); i++) {
			//if (lista.get(i) instanceof Pessoa) {
				Pessoa p = (Pessoa) lista.get(i);
				System.out.println(p.getNome() + "-" + p.getIdade());
			//} else {
			//	Cliente c = (Cliente) lista.get(i);
			//	System.out.println(c.getNome());
		//	}

		}
	}
}
