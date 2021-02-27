package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Carne", 0.223);
		Comida c2 = new Comida("Farofa", .100);
		
		Pessoa p = new Pessoa("João", 89.9);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
