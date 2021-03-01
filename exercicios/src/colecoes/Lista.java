package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	
	public static void main(String[] args) {
		
		//ArrayList<Usuario> lista = new ArrayList<>();
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Bruna"));
		lista.add(new Usuario("Lia"));
		
		System.out.println("O usuário de índice 3 é: " + lista.get(3).nome); // aqui você consegue acessar pelo indice
		
		System.out.println("Item removido: " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		for (Usuario usuario : lista) {
			
			// quando passamos usuario, a classe implicitamente usa o metodo toString na hora de imprimir
			System.out.println(usuario);
		}
	}
}
