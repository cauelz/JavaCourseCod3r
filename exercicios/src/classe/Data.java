package classe;

public class Data {

	int dia;
	int mes;
	int ano;	
	
	Data() {
		
		// esta forma só serve para chamar um construtor dentro de outro construtor.
		this(1, 2, 1980);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
