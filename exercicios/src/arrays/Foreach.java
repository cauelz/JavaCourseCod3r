package arrays;

public class Foreach {

	
	public static void main(String[] args) {
		
		double[] notas = {1, 3, 8, 4, 5, 3 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
	}
}
