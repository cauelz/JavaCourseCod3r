package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
//		double notasAlunoB[] = new double[3];
//		double []notasAlunoC = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 8.9;
		notasAlunoA[1] = 10; // veja que temos aqui uma conversão implícita para o tipo inteiro
		notasAlunoA[2] = 3.3;
		
		System.out.println(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		double media = total/notasAlunoA.length;
		
		System.out.println(media);
		
		//double[] notasAlunoD = {1, 6, 7, 8, 3}; // outra forma de declarar um array, não confundir com Javascript.
		
	}
}
