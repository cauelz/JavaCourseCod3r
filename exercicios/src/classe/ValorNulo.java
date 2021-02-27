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
		
		/* Temos alguns tipos de erros, dois deles s�o:
		 * 
		 *  1- Erro de Compila��o: Um erro que ocorre quando tenta-se transformar um arquivo .java para .class. 
		 *  O compilador nao deixa voc� seguir.
		 *  
		 *  2- Erro de Runtime: Que s�o erros que ocorrem depois da compila��o/execu��o.
		 *  
		 * Quando temos uma variavel Nula, ela n�o aponta para nenhum endere�o de memoria ou n�o possui nenhum valor.
		 * Por isso quando tentamos atribuir um valor a uma variavel nula, temos um erro. Ela n�o aponta para lugar nenhum na memoria.
		 * 
		 * 
		 * */
	}
}
