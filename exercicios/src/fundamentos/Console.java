package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		// ficaram na mesma linha
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		
		
		// pularam linhas
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Megasena: %d %d %d %d %n", 1, 2, 3, 4);
		System.out.printf("Salário: %.1f%n", 12345.345);
		
		// Utilizando o Scanner
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o seu idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
