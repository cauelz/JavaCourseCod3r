package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		/* Declaração de variáveis
		 * 
		 * double = ponto flutuante
		 * final para tonar constante
		 * convenção: constantes com letra maiuscula.
		 * 
		 * */
		
		
		double raio = 3.4;
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m².");
	}
}
