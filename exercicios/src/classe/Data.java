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
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
