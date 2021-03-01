package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// a partir de agora, a variavel lista só vai aceitar dados do tipo String
		// temos uma forma mais enxuta da declaração abaixo, veja:
		// Set<String> lista = new HashSet<>();
		//Set<String> listaAprovados = new HashSet<String>();
		
		// Podemos adicionar ordenação na collection usando o Treeset
		//TreeSet<String> listaAprovados = new TreeSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (Integer number : nums) {
			System.out.println(number);
		}
	}
}
