package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro salario: ");
		String salario1 = entrada.nextLine().replace(',', '.');
		
		System.out.print("Digite o seu segundo salario: ");
		String salario2 = entrada.nextLine().replace(',', '.');
		
		System.out.print("Digite o seu terceiro salario: ");
		String salario3 = entrada.nextLine().replace(',', '.');
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		System.out.println("A média dos salarios é: " + (numero1 + numero2 + numero3) / 3);
		
		entrada.close();
	}
}
