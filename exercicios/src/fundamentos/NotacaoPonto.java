package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X"; // não é tipo primitivo nem palavra reservada
		
		// alguns métodos...
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Cauê".toUpperCase());
		
		System.out.println("Bom dia X".replace("X", "Cauê").toUpperCase().concat(" !!"));
	}
}
