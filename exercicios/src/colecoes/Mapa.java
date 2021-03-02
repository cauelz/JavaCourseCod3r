package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1,  "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Luana");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // verifica o tamanho do Map
		System.out.println(usuarios.isEmpty()); //verifica se esta vazio
		
		System.out.println(usuarios.keySet()); // mostra os valores das chaves dentro de um array
		System.out.println(usuarios.values()); // mostra os valores armazenados em cada chave
		System.out.println(usuarios.entrySet()); // mostra tanto as chaves quanto os seus valores
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println(usuarios.get(4));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String usuario : usuarios.values()) {
			System.out.println(usuario);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " =>> ");
			System.out.println(registro.getValue());
		}
	}
}
