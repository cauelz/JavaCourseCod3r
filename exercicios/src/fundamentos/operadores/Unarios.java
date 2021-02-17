package fundamentos.operadores;

public class Unarios {

	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafios...");
		System.out.println( ++a == b--);
		/* No caso acima, vamos ter um resultado verdadeiro, mas PQ?
		 * 
		 * Temos que levar em conta a precedencia dos operadores na comparação acima.
		 * 
		 * ++a mostra que estamos com pressa com a atribuição do valor 1 a variavel "a", assim irá acontecer antes da comparação.
		 * b-- mostra que estamos sem pressa com o decremento do valor 1 a variavel "b", assim ira acontecer depois da comparação.
		 * 
		 * Logo, temos que a = 2, comparamos com b = 2 e depois temos b = 1.
		 * */
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
