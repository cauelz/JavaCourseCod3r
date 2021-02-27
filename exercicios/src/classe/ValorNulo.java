package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "OPAA!!!" : null;
		
		if(s2 != null) {
			
			System.out.println(s2.concat("!!"));
		}
		
		/* Temos alguns tipos de erros, dois deles são:
		 * 
		 *  1- Erro de Compilação: Um erro que ocorre quando tenta-se transformar um arquivo .java para .class. 
		 *  O compilador nao deixa você seguir.
		 *  
		 *  2- Erro de Runtime: Que são erros que ocorrem depois da compilação/execução.
		 *  
		 * Quando temos uma variavel Nula, ela não aponta para nenhum endereço de memoria ou não possui nenhum valor.
		 * Por isso quando tentamos atribuir um valor a uma variavel nula, temos um erro. Ela não aponta para lugar nenhum na memoria.
		 * 
		 * 
		 * */
	}
}
