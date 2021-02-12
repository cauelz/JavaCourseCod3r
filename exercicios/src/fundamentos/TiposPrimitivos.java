package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
	
		// informa��es do funcionario
		
		// Tipos n�mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_844_123L;
		
		// Tipos n�mericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_767_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = true;
		
		//Tipo caractere
		// char status = 'AB'; n�o funciona
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}
}
