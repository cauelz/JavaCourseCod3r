package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X"; // n�o � tipo primitivo nem palavra reservada
		System.out.println(a);
		
		// alguns m�todos...
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Cau�".toUpperCase());
		
		System.out.println("Bom dia X".replace("X", "Cau�").toUpperCase().concat(" !!"));
	}
}
