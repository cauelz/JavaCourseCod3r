package classe;

public class PrimeiroTrauma {

	int a = 3;
	
	// podemos declarar a variavel como estatica e ela vai pertencer a classe e nao ao objeto;
	// um membrio estático pode acessar outro membro estático
	static int b = 4;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma obj = new PrimeiroTrauma();
		
		System.out.println(obj.a);
		
		System.out.println(b);
	}
}
